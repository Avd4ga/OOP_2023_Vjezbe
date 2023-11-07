package LabWeek6;


public class Zad3 {

    public static int indexSmallestStart(int[] array, int a) {
        int ind=0;
        int min = array[a];
        for (int i = a; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                ind=i;
            }
        }


        return ind;
    }

    public static void main(String[] args) {

        int a=3;
        int[] arr = { 3, 4, 23, 13, 6, 300};
        System.out.println(indexSmallestStart(arr,a));


    }
}