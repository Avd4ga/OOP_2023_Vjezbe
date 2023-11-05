package LabWeek5.Task3.boxes;

public class Main {
    public static void main(String[] args) {

        MaxWeightBox coffeeBox=new MaxWeightBox(10);

        System.out.println("---------MAX WEIGHT---------");
        coffeeBox.add(new Thing("Saludo",1));
        coffeeBox.add(new Thing("Pirka",1));
        coffeeBox.add(new Thing("Kopi Luwak",1));

        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));

        System.out.println("---------ONE THING---------");
        OneThingBox box=new OneThingBox();
        box.add(new Thing("Saludo",5));
        box.add(new Thing("Pirka",5));
        box.add(new Thing("Sudo",5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirka")));
        System.out.println(box.isInTheBox(new Thing("Sudo")));


        System.out.println("---------BLACKBOX---------");
        BlackHoleBox box1=new BlackHoleBox();
        box.add(new Thing("Saludo",5));
        box.add(new Thing("Pirka",5));

        System.out.println(box1.isInTheBox(new Thing("Saludo")));
        System.out.println(box1.isInTheBox(new Thing("Pirka")));

        Box box2 = new MaxWeightBox(10);
        Box box3 = new OneThingBox();
        Box box4 = new BlackHoleBox();


        if (box2 instanceof MaxWeightBox) {
            MaxWeightBox maxWeightBox = (MaxWeightBox) box2;

        }

        if (box3 instanceof OneThingBox) {
            OneThingBox oneThingBox = (OneThingBox) box3;

        }

        if (box4 instanceof BlackHoleBox) {
            BlackHoleBox blackHoleBox = (BlackHoleBox) box4;

        }

    }
}
