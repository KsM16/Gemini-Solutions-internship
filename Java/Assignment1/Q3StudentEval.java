import java.util.*;

public class Q3StudentEval {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        // to store student Objects,
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("No. of students : ");
        int count = sn.nextInt();
        int i = 0;

        while (i < count) {
            System.out.println("Student " + (i + 1));
            System.out.println("Name: ");
            String name = sn.next();
            System.out.println("Roll: ");
            int roll = sn.nextInt();

            int[] marks = new int[3];
            boolean invalid = false;

            for (int j = 0; j < 3; j++) {
                System.out.println("marks " + (j + 1) + ": ");
                marks[j] = sn.nextInt();
                if (marks[j] < 0 || marks[j] > 100) {
                    System.out.println("invalid marks");
                    invalid = true;
                    break;
                }
            }

            if (invalid) {
                continue;
            }

            int total = marks[0] + marks[1] + marks[2];
            double avg = total / 3.0;
            char grade;

            if (avg >= 90) grade = 'A';
            else if (avg >= 80) {
                grade = 'B';
            }
            else if (avg >= 70) {
                grade = 'C';
            }
            else if (avg >= 60){
                grade = 'D';
            }
            else{
                grade = 'F';
            }

            students.add(new Student(name, roll, marks, total, avg, grade));
            i++;
        }

        while (true) {
            System.out.println("1. All information");
            System.out.println("2. A grade only");
            System.out.println("3. Exit");
            System.out.println("select one option : ");
            int ch = sn.nextInt();

            if (ch == 1) {
                for (Student s : students){
                    s.show();
                }
            }
            else if (ch == 2) {
                for (Student s : students) {
                    if (s.getGrade() == 'A') {
                        s.show();
                    }
                }
            }
            else if (ch == 3) {
                break;
            }
            else {
                System.out.println("invalid input");
            }
        }
    }
}

class Student {
    String name;
    int roll;
    int[] marks;
    int total;
    double avg;
    char grade;

    Student(String n, int r, int[] m, int t, double a, char g) {
        this.name = n;
        this.roll = r;
        this.marks = m;
        this.total = t;
        this.avg = a;
        this.grade = g;
    }

    char getGrade() {
        return grade;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll no.: " + roll);
        System.out.println("Marks: " + marks[0] + " " + marks[1] + " " + marks[2]);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
