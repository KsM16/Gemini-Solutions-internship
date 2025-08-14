
/*
Q7. Java supports multiple ways of defining custom sorting logic.
Describe how you would sort a list of objects by multiple fields (e.g., first by department name, then by joining date).
Explain with an example.

Solution -
We can sort by implemnting Comparator or by using static helper method from Comparator

*/
package Assignment3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q7SortingLogic {
    public static void main(String[] args) {
        List<Company> emp = new ArrayList<>();
        emp.add(new Company("Kshitiz", "QA", LocalDate.of(2025, 10, 16)));
        emp.add(new Company("Manral", "Test", LocalDate.of(2020, 3, 1)));
        emp.add(new Company("Tim", "Dev", LocalDate.of(2029, 2, 20)));
        emp.add(new Company("David", "Finance", LocalDate.of(2021, 4, 3)));

        emp.sort(Comparator.comparing(Company:: getDept)
                           .thenComparing(Company:: getDate)

        );
        emp.forEach(System.out :: println);
    }
}
    class Company{
    String name;
    String dept;
    LocalDate date;

    public Company(String name, String dept, LocalDate date){
        this.name =name;
        this.dept = dept;
        this.date = date;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public LocalDate getDate(){
        return date;
    }
    public String toString(){
        return  "name='" + name  +
                ", department='" + dept + '\'' +
                ", date=" + date;
    }
}
