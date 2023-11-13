package LabWeek6.Zad5;

public class BinarySearch {

     public static boolean search(int[] arr, int a){

        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(arr[mid]==a){
                return true;
            }
            else if(arr[mid]<a){

                l=mid+1;

            }
            else {
                r = mid - 1;
            }

        }

         return false;


    }

}
