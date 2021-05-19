package vn.techmaster;

import java.util.Scanner;

public class ArrayB1 {
    public static void show(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static int Max(int[] a) {
        int max = a[0];
        for (int j : a) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
  /*  public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }*/

    public static int min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        return min;
    }

    public static int searchElement(int[] arr, int x) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i+1;
        }
        return -1;
    }

}
