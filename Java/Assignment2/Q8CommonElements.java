package Assignment2;

import java.util.*;

public class Q8CommonElements {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ArrayList<Integer> list =  new ArrayList<>();
        int[] arr1 = {1, 2, 3, 4} ;
        int[] arr2 = {3, 4, 5, 6};
        int max =0;
        for (int i : arr1){
            max = Math.max(i,max);
        }
        for (int i : arr2){
            max = Math.max(i,max);
        }

        int[] freq = new int[max+1];
        for (int i : arr1){
            freq[i]++;
        }
        for (int i : arr2){
            freq[i]++;
        }
        for (int i=0; i<freq.length; i++){
            if (freq[i] > 1){
                list.add(i);
            }
        }
        Integer[] res = list.toArray(new Integer[0]);
        for (var i : res){
            System.out.print(i+" ");
        }
    }
}
