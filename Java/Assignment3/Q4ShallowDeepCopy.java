/*
Q4. Explain the difference between shallow copy and deep copy in Java.
When does it matter and how do you implement each?

Solution -

A shallow copy creates a new Object of the main Object. The newly created object points to same memory location
as that of the original one. Change in one affects the other one.

A deep copy creates a completely different object, which are independant of each other
  */
package Assignment3;

public class Q4ShallowDeepCopy {
    public static void main(String[] args){
        Student stu1 = new Student("Kshitiz",1);
        Student stu2 =stu1; // Shallow copy
        System.out.println("Shallow Copy Example : ");
        System.out.println("Before changing, Stu1 name = "+stu1.name + " Stu2 name = "+stu2.name);
        stu2.name = "Manral";
        System.out.println("After changing, Stu1 name = "+stu1.name + " Stu2 name = "+stu2.name);
        // Deep copy
        System.out.println("Deep Copy Example : ");
        Student stu3 =   Student.deepCopy(stu1);
        System.out.println("Before changing, Stu1 name = "+stu1.name + " Stu3 name = "+stu3.name);
        stu3.name = "Rahul";
        System.out.println("Before changing, Stu1 name = "+stu1.name + " Stu3 name = "+stu3.name);


    }
}
class Student{
    String name;
    int id;
    public Student(String name, int id){
        this.name = name;
        this.id =id;
    }
    public static Student deepCopy(Student other){
        return new Student(other.name, other.id);
    }
}
