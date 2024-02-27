package Random.FinalPrep;


import java.io.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface CustomFieldWriter {

}

class InvalidFieldException extends RuntimeException{
    public InvalidFieldException(String message){
        super(message);
    }
}

class ByBook {
    @CustomFieldWriter
    private Date date;
    private String quarter;
    private int quantity;
    private int year;
    @CustomFieldWriter
    private String customerId;
    private Double totalAmount;
    private Double profitPercentage;
    private Double profitIncrease;
    @CustomFieldWriter
    private Double costPrice;

    public ByBook(ByBookBuilder builder) {
        this.date = builder.date;
        this.quarter = builder.quarter;
        this.quantity = builder.quantity;
        this.year = builder.year;
        this.customerId = builder.customerId;
        this.totalAmount = builder.totalAmount;
        this.profitPercentage = builder.profitPercentage;
        this.profitIncrease = builder.profitIncrease;
        this.costPrice = builder.costPrice;
    }

    public Date getDate() {
        return date;
    }

    public String getQuarter() {
        return quarter;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getYear() {
        return year;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Double getProfitPercentage() {
        return profitPercentage;
    }

    public Double getProfitIncrease() {
        return profitIncrease;
    }

    public Double getCostPrice() {
        return costPrice;
    }

static class ByBookBuilder{
    private Date date;
    private String quarter;
    private int quantity;
    private int year;

    private String customerId;
    private Double totalAmount;
    private Double profitPercentage;
    private Double profitIncrease;

    private Double costPrice;
    public ByBookBuilder(){

    }

    public ByBookBuilder setDate(Date date) {
        this.date = date;
        return this;
    }

    public ByBookBuilder setQuarter(String quarter) {
        this.quarter = quarter;
        return this;
    }

    public ByBookBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ByBookBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public ByBookBuilder setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public ByBookBuilder setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public ByBookBuilder setProfitPercentage(Double profitPercentage) {
        this.profitPercentage = profitPercentage;
        return this;
    }

    public ByBookBuilder setProfitIncrease(Double profitIncrease) {
        this.profitIncrease = profitIncrease;
        return this;
    }

    public ByBookBuilder setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
        return this;
    }
    public ByBook build(){
        return new ByBook(this);
    }
  }
}
class SecondGroup{
    List<ByBook> books;
    public SecondGroup(String filename){
        this.books=loadbooks(filename);
    }

    private static List<ByBook> loadbooks(String filename){
        try{
            List <ByBook> books=new ArrayList<>();
            BufferedReader reader=new BufferedReader(new FileReader(filename));

            List<String> lines=reader.lines().toList();

            for(int i=1;i<lines.size();i++){
                String[] templine=lines.get(i).split(";");
                if(templine[0] == ""|| templine[1]==""||templine[2]=="")throw new InvalidFieldException("You have empty values!!!!");
            books.add(new ByBook.ByBookBuilder().setDate(new SimpleDateFormat("MM/dd/yyyy").parse(templine[0])).setQuarter(templine[1]).setQuantity(Integer.parseInt(templine[2])).setYear(Integer.parseInt(templine[3])).setCustomerId(templine[4]).setTotalAmount(Double.parseDouble(templine[5])).setProfitPercentage(Double.parseDouble(templine[6])).setProfitIncrease(Double.parseDouble(templine[7])).setCostPrice(Double.parseDouble(templine[8])).build());
            }
            reader.close();
        return books;

        }catch (IOException | ParseException e){
            throw new RuntimeException(e);
        }
    }
    public List<ByBook> getBooks(){
        return this.books;
    }

}
class CustomFileWriter{
    public static void generateReport(List<ByBook> books, String outputFileman){
        Class<ByBook> clazz= ByBook.class;
        Field[] fields=clazz.getDeclaredFields();

        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter(outputFileman));

            writer.write("Date,CustomerID,Amount\n");
            for(ByBook book:books){
                String tempString="";
                for (Field field:fields){
                    if(field.isAnnotationPresent(CustomFieldWriter.class)){
                        field.setAccessible(true);
                        String value=field.get(book).toString();
                        tempString=tempString.concat(value.concat(","));
                    }
                }
                writer.write(tempString);
                writer.write("\n");
            }
            writer.close();

        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);

    }
}
}
class FinalRunTest {
    public static void main(String[] args) {
        SecondGroup group = new SecondGroup("books.csv");
        CustomFileWriter.generateReport(group.getBooks(), "second-group-csv");
    }
}