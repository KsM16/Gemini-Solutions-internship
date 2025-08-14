/*
Q6. Describe how Java handles error and exception scenarios. Differentiate between system-level and
application-level exceptions using real-world examples.

Solution -
Exception handling enables users to contain unforeseen hindrances in their code making more reliable codes
Java exception handling mechanism include keywords like  : try, catch, finally, throw, and throws.

System-level Exceptions :
they include exceptions thrown by JVM and are beyond control of application and indicate issues with the environment
example -  OutOfMemoryError, StackOverflowError

Application-Level Exceptions :
They are thrown by application code and are problems specific to application logic.
example -  ArithmeticException, IllegalArgumentException

 */
package Assignment3;

import java.util.Scanner;

public class  Q6ErrorException {
    public static void checkGrade(int grade) throws Exception {
        if (grade < 0 || grade > 100) {
            throw new Exception("Invalid grade. Grade must be between 0 and 100.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter student's grade (0-100): ");
            int grade = scanner.nextInt();
            checkGrade(grade);
            System.out.println("Grade entered: " + grade);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("End of grade input process.");
            scanner.close();
        }
    }
}