package Random.FinalPrep2;


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
import java.util.stream.Collectors;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface WritableField {
}

class InvalidCastException extends RuntimeException{
    public InvalidCastException(String mess){
        super(mess);
    }
}

class Item{
    @WritableField
    private Date date;
    private String quarter;
    private int quantity;
    private int year;
    @WritableField
    private String customerId;
    @WritableField
    private Double totalAmount;
    private Double profitPct;
    private Double profitInr;
    private Double costPrice;

    public Item(ItemBuilder builder){
        this.date=builder.date;
        this.quarter = builder.quarter;
        this.quantity = builder.quantity;
        this.year = builder.year;
        this.customerId = builder.customerId;
        this.totalAmount = builder.totalAmount;
        this.profitPct = builder.profitPct;
        this.profitInr = builder.profitInr;
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

    public Double getProfitPct() {
        return profitPct;
    }

    public Double getProfitInr() {
        return profitInr;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    static class ItemBuilder{
        private Date date;
        private String quarter;
        private int quantity;
        private int year;
        private String customerId;
        private Double totalAmount;
        private Double profitPct;
        private Double profitInr;
        private Double costPrice;

        public ItemBuilder(){

        }

        public ItemBuilder setDate(Date date) {
            this.date = date;
            return this;
        }

        public ItemBuilder setQuarter(String quarter) {
            this.quarter = quarter;
            return this;
        }

        public ItemBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public ItemBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public ItemBuilder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public ItemBuilder setTotalAmount(Double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public ItemBuilder setProfitPct(Double profitPct) {
            this.profitPct = profitPct;
            return this;
        }

        public ItemBuilder setProfitInr(Double profitInr) {
            this.profitInr = profitInr;
            return this;
        }

        public ItemBuilder setCostPrice(Double costPrice) {
            this.costPrice = costPrice;
            return this;
        }
        public Item build(){
            return new Item(this);
        }
    }}
     class FinalPrep{
        private List<Item> items;
        public FinalPrep(String filename){ try{
            items=loadItems(filename);
        }catch(IOException | ParseException e){
            throw new RuntimeException(e);
        }
        }


        public static List<Item> loadItems(String filename) throws IOException, ParseException {
            List<Item> items=new ArrayList<>();
            BufferedReader reader=new BufferedReader(new FileReader(filename));
            List<String> lines=reader.lines().collect(Collectors.toList());
            for(int i=1;i< lines.size();i++){
                String line= lines.get(i);
                String[] parsedLine=line.split(";");
                if(parsedLine[0]==""||parsedLine[1]==""||parsedLine[2]=="")throw new InvalidCastException("empty linesss!!");
                Item it=new Item.ItemBuilder().setDate(new SimpleDateFormat("MM/dd/yyyy").parse(parsedLine[0])).setQuarter(parsedLine[1]).setQuantity(Integer.parseInt(parsedLine[2])).setYear(Integer.parseInt(parsedLine[3])).setCustomerId(parsedLine[4]).setTotalAmount(Double.parseDouble(parsedLine[5])).setProfitPct(Double.parseDouble(parsedLine[6])).setProfitInr(Double.parseDouble(parsedLine[7])).setCostPrice(Double.parseDouble(parsedLine[8])).build();
                items.add(it);
            }
            reader.close();
            return items;




        }
    public List<Item> getItems(){
        return this.items;
    }
}
class ReportWriter{
    public static void ReportWriter(String filename,List<Item> items){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
            Class clazz= Item.class;
            Field[] fields=Item.class.getDeclaredFields();

            for (Item item:items) {
                String temp="";
                for(Field f:fields){
                    if(f.isAnnotationPresent(WritableField.class)){
                        f.setAccessible(true);
                        String fieldVal=f.get(item).toString();
                        temp=temp+fieldVal+";";
                    }

                }
                writer.write(temp+"\n");

            }

            writer.close();


        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}




class Main{
    public static void main(String[] args) {
  FinalPrep prep=new FinalPrep("books.csv");
  ReportWriter.ReportWriter("NoviList.csv",prep.getItems());

    }
}

