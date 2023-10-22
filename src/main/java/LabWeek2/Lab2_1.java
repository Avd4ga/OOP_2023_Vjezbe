package LabWeek2;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while(true){
            System.out.println("Enter a pass:");
            String pass=scan.nextLine();

            if(pass.equals("carrot")){

                System.out.println("The secter is: dsadads");
                break;
            }else{
                System.out.println("Wrong!!");


            }

        }


    }
}
