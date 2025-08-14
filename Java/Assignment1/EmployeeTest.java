public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1009, "Manral", 100, 'C', false);
        Employee emp2 = new Employee(1007, "Kshitiz", 200, 'A', true);

        System.out.println("Employee 1 details are as follows :");
        System.out.println("ID: " + emp1.getEmployeeId());
        System.out.println("Name: " + emp1.getEmployeeName());
        System.out.println("Salary: " + emp1.getBasicSalary());
        System.out.println("Grade: " + emp1.getGrade());
        System.out.println("Active: " + emp1.isActive());
        System.out.println("Net Salary: " + emp1.calculateNetSalary());



        System.out.println("Employee 2 details are as follows :");
        System.out.println("ID: " + emp2.getEmployeeId());
        System.out.println("Name: " + emp2.getEmployeeName());
        System.out.println("Salary: " + emp2.getBasicSalary());
        System.out.println("Grade: " + emp2.getGrade());
        System.out.println("Active: " + emp2.isActive());
        System.out.println("Net Salary: " + emp2.calculateNetSalary());
    }
}

class Employee{
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private char grade;
    private boolean isActive;

    // constructor
    public Employee(int e_id, String e_name, double e_basicSalary, char e_grade, boolean e_isActive) {
        this.employeeId = e_id;
        this.employeeName = e_name;
        this.basicSalary = e_basicSalary;
        this.grade = e_grade;
        this.isActive = e_isActive;
    }

    //    get-methods
    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public char getGrade() {
        return grade;
    }
    public boolean isActive() {
        return isActive;
    }
    //salary method
    public double calculateNetSalary() {
        double hra = basicSalary*0.20;
        double da = basicSalary*0.10;
        double pf = basicSalary*0.12;
        double netSal =  basicSalary +hra+da-pf;
        return netSal;
    }
}

