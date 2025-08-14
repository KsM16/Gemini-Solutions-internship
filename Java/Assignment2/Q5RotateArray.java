package Assignment2;
//5. Rotate an Array by K Positions
//
//Given an array, rotate the elements to the right by k steps.
// Input: [1, 2, 3, 4, 5, 6, 7], k = 3
//  Output: [5, 6, 7, 1, 2, 3, 4]

import java.util.*;
public class Q5RotateArray {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter array length :");
        int n = sn.nextInt(); // array length
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sn.nextInt();
        }
        System.out.println("Enter steps of rotation :");
        int k = sn.nextInt();
        k = k%n;
        rev(arr,0,n-1);
        rev(arr,0,k-1);
        rev(arr,k,n-1);

        System.out.println("Rotated array : ");
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void rev(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
