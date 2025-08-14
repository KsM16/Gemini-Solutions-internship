package Assignment1;
import java.util.*;
public class Q5_solution {
    public static void main(String[] args) {
        int x = 10, y = 20;
        if (x++ > 10 || ++y > 20) {
            System.out.println("Condition True");
            System.out.println(x);
            System.out.println(y);
        }
        System.out.println("x = " + x + ", y = " + y);
    }

}

// Output
//Condition True
//x = 11, y = 21

// Reason : post/pre increment operators store the updated value of variable.
// x is 10 so (x++>10) is false
// y is 21 so (++y>20) is true
// in the end the updated values are printed
