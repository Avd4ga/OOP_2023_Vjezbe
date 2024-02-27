package Random.Finalprep3;



import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


class InvalidCastException1 extends RuntimeException{
    public InvalidCastException1(String mess){
        super(mess);
    }
}
public class Coffee {
@WriteField
    private String name;
    private double price;

    private Coffee(CoffeeBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void display(){
        System.out.println("Name: "+name+" Price: "+price);
    }

    static class CoffeeBuilder{
        private String name;
        private double price;

        public CoffeeBuilder(){

        }

        public CoffeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CoffeeBuilder setPrice(double price) {
            this.price = price;
            return this;
        }
        public Coffee build(){
            return new Coffee(this);
        }
    }


}

class Menu{
    List<Coffee> menu=new ArrayList<>();
    private String filename;

    public void addCoffee(Coffee coffee){
        menu.add(coffee);
    }

    public void getMenu(){
        for(Coffee c:menu){
            c.display();
        }
    }
    public Menu(){

    }
    public Menu(String filename){
        this.filename=filename;

    }

    public void createMenuFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
            for(Coffee c:menu){
                writer.write(c.getName()+":"+c.getPrice()+"\n");
            }
            writer.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void createMenuFileAnnot(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("annotedMenu.csv"));
            List<Coffee> newl=readMenuFile(filename);
            Field[] fields=Coffee.class.getDeclaredFields();
            for(Coffee c:newl){
                String temp="";
                for(Field f:fields){
                    if(f.isAnnotationPresent(WriteField.class)){
                        f.setAccessible(true);
                        String fieldVal=f.get(c).toString();
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
    public List<Coffee> readMenuFile(String filename){
        List<Coffee> newlist=new ArrayList<>();
        try {
            BufferedReader reader=new BufferedReader(new FileReader(filename));
            List<String> lines=reader.lines().toList();
            for (int i=1;i<lines.size();i++){
                String line=lines.get(i);
                String[] parsedLine=line.split(":");
                if(parsedLine[0]==""||parsedLine[1]=="")throw new InvalidCastException1("empty linesss!!");
                Coffee c1=new Coffee.CoffeeBuilder().setName(parsedLine[0]).setPrice(Double.parseDouble(parsedLine[1])).build();
                newlist.add(c1);
            }
        reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return newlist;
    }



}


class Main{
    public static void main(String[] args) {
        Coffee coffe=new Coffee.CoffeeBuilder().setName("Espresso").setPrice(3.5).build();
        Coffee coffe1=new Coffee.CoffeeBuilder().setName("Cappucci").setPrice(5.5).build();
        System.out.println(coffe.getName()+" "+coffe.getPrice());
        Menu menu=new Menu("Menu.csv");
        menu.addCoffee(coffe);
        menu.addCoffee(coffe1);
        menu.getMenu();


        menu.createMenuFileAnnot();
    }
}
