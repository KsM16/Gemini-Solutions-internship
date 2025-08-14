package Assignment2;
//  6. Merge Two Sorted Arrays Without Extra Space

import java.util.*;
public class Q6MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        merge(arr1,arr2);
        System.out.println("arr1 : ");
        for (int i : arr1){
            System.out.print(i+" ");
        }

        System.out.println("\n arr2 : ");
        for (int i : arr2){
            System.out.print(i + " ");
        }
    }
    public static void merge(int[] arr1, int[] arr2){
        for (int i =0; i< arr1.length; i++){
            // swap if arr1 element > arr2 element
            if (arr1[i] > arr2[0] ){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }

            // sort arr2
            int first2 = arr2[0];
            int k =0;

            // finding the correct position of arr2[0]
            for (k =1; k< arr2.length && arr2[k] < first2; k++){
                arr2[k-1] = arr2[k];

            }
            arr2[k-1] =  first2;
        }
    }
}
