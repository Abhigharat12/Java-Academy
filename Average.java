import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        try (Scanner sc = new Scanner(System.in)) {
        
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            int sum = num1 + num2 + num3;
            float average = sum / 3;
            System.out.println("The average is: " + average);

        }
    }
}
