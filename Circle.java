import java.util.*;

public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double pi = 3.14;

        double area = pi * radius * radius;

        System.out.println("Area of the circle is: " + area);
    }
}