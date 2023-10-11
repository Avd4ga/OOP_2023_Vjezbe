package LabWeek2;

import java.util.Scanner;

public class Lab2_5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a stepen: ");
        int step=scan.nextInt();
        int sum=0;
        for(int i=0;i<=step;i++){

            sum+=Math.pow(2,i);


        }
        System.out.println("sum="+sum);


    }
}
