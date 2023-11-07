package LabWeek6;


public class Zad1 {

    public static int smallest(int[] array) {
        int min;
        min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }


        return min;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 4, 23, 2, 6, 300};
        System.out.println(smallest(arr));


    }
}