package Random;

import java.util.ArrayList;
import java.util.Arrays;

class Binary {

     int binarySearch(int[] arr,int x){

        int right=arr.length-1;
        int left=0;

        while (left<=right){

            int middle=left+(right-left)/2;

            if(x==arr[middle]){

                return middle;

            }

            if(arr[middle]<x){

                left=middle+1;

            }
            else {

                right=middle-1;

            }


        }



        return -1;

    }




    public static void main(String args[])
    {
        Binary ob = new Binary();
        int arr[] = { 56, 3, 4, 10, 40 };
        int n = arr.length;
        Arrays.sort(arr);

        for (int a:arr) {

            System.out.println(a);

        }
        int x = 11;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
}
