package LabWeek2;

public class Lab2_8 {
    public static void main(String[] args) {
        printStars(4);
    }

    public static void printStars(int amount){

        for(int i=0;i<=amount;i++){
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }

    }

}
