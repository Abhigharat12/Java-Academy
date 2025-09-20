import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter the Basic Salary");

        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        double hra = 0, da = 0;

        if (salary <= 10000) {
            hra = 0.20 * salary;
            da = 0.80 * salary;
        } else if (salary <= 20000) {
            hra = 0.25 * salary;
            da = 0.90 * salary;
        } else if (salary > 20000) {
            hra = 0.30 * salary;
            da = 0.95 * salary;
        } else {
            System.out.println("Enter valid salary");
        }

        double gross = salary + hra + da;

System.out.println("The gross salary of employee is = " + gross);


boolean x=

        sc.close();
    }
}
