package Assignment2;
import java.util.*;

public class Q7ReverseWords {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sn.nextLine();
        System.out.println(helperFunc(input));
    }
    // Helper function
    public static String helperFunc(String str){
        char[] input = str.toCharArray();
        int start=0, n = input.length;
        for (int end =0; end<=n; end++){
            if (end == ' ' || end == n){
                reverse(input,start,end-1);
                start = end +1;
            }
        }
        return new String(input);
    }

    // reverse function
    public static void reverse(char[] arr, int l, int r){
        while(l<r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;

        }
    }

}
