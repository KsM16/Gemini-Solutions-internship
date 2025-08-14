package Assignment3;

import java.util.*;
import java.util.stream.Collectors;


public class Q1Employee {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter no. of employees : ");
        int n = sn.nextInt();

        // ArrayList to store Employee datatype

        ArrayList<Gemini> record = new ArrayList<>();

        for (int i=0; i<n; i++){
            System.out.println("Enter details of Employee # "+ (i+1));
            sn.nextLine();
            System.out.println("Enter name : ");
            String name = sn.nextLine();
            System.out.println("Enter age : ");
            int age = sn.nextInt();
            System.out.println("Enter salary : ");
            float salary = sn.nextFloat();

            Gemini emp = new Gemini(name,age,salary);
            record.add(emp);

        }

        List<Gemini> res = record
                .stream()
                .filter(e -> e.salary > 50000)
                .sorted((e1,e2) -> Float.compare(e2.salary,e1.salary))
                .collect(Collectors.toList());
        System.out.println("Output : \n");
        res.forEach(System.out::println);

    }
}

//Employee class

class Gemini {
    String name;
    int age;
    float salary;

    public Gemini(String n, int a, float s){
        this.name =n;
        this.age = a;
        this.salary= s;
    }
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}

