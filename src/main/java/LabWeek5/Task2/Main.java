package LabWeek5.Task2;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(10.0);

        Book book1= new Book("Fedor Dosto","Crime and Puni",2);
        Book book2=new Book("Robert M","Clean Code",1);

        CD cd1=new CD("Pink Floyd","Dark side of the mood",1973);
        CD cd2=new CD("Wigwam","Nuclear Nightclub",1975);

        box.add(book1);
        box.add(book2);
        box.add(cd1);
        box.add(cd2);

        System.out.println(box);


    }
}
