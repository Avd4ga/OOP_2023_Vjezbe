package LabWeek6;

public class Zad6 {

    public static String printElegant(int[] array){

        String str="";
        for(int i=0;i< array.length-1;i++){

            str+=array[i]+", ";

        }



    return str+array[array.length-1];
    }

    public static void main(String[] args) {
        int[] array={5,1,3,4,2};

        System.out.println(printElegant(array));
    }
}
