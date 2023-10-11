package LabWeek2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sum=0;
        int read=0;
        while(read<3){
            System.out.print("Enter a num: ");
            sum+=scan.nextInt();
            read++;
        }
        System.out.println("Sum" + sum);

    }
}
