package LabWeek2;

import java.util.Scanner;
public class Lab2_3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int num;
        int sum=0;
        while(true){
            System.out.print("Enter a num: ");
            num=scan.nextInt();
            if(num==0){
                break;
            }else{
                sum+=num;
            }
        }
        System.out.println(sum);

    }
}
