package LabWeek6.Zad5;

public class BinarySearch {

    public static boolean search(int[] arr,int a){

        int l=0;
        int r=arr.length-1;

        {
            while (l <= r) {
                int m = l + (r - l) / 2;

                // Check if x is present at mid
                if (arr[m] == a)
                    return true;

                // If x greater, ignore left half
                if (arr[m] < a)
                    l = m + 1;

                    // If x is smaller, ignore right half
                else
                    r = m - 1;
            }

            // If we reach here, then element was not present
            return false;
        }




    }

}
