import java.util.Scanner;

public class EO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("Even Number");
                break;
            case 1:
            case -1: // handle negative odd numbers
                System.out.println("Odd Number");
                break;
        }
    }
}
