package LabWeek6;

public class Zad4 {

    public static void swap(int[] array,int ind1,int ind2){

        int help;
        help=array[ind1];
        array[ind1]=array[ind2];
        array[ind2]=help;



    }

    public static void main(String[] args) {

        int[] arr = { 3, 4, 23, 13, 6, 300};
        swap(arr,2,5);
        for(int a:arr){
            System.out.println(a);
        }

    }
}
