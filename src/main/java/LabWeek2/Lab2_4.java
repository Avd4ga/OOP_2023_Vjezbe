package LabWeek2;

import java.util.Scanner;

public class Lab2_4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int fir=scan.nextInt();
        System.out.print("Enter a num: ");
        int las=scan.nextInt();

        while(fir<=las){

            System.out.println(fir);
            fir++;

        }


    }
}
