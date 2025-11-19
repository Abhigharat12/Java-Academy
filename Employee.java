public class Employee {
    String Ename;
    int Eid;
    int Esalary;

    // Constructor
    Employee(String Ename, int Eid, int Esalary) {
        this.Ename = Ename;
        this.Eid = Eid;
        this.Esalary = Esalary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name is : " + Ename);
        System.out.println("Employee ID is : " + Eid);
        System.out.println("Employee Salary with 10% bonus is : " + (Esalary + (Esalary * 0.10)));
        System.out.println("----------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Employee e1 = new Employee("Abhi", 101, 25000);
        e1.displayDetails();

        Employee e2 = new Employee("Ravi", 102, 30000);
        e2.displayDetails();
    }
}
