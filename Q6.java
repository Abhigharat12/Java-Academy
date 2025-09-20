
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter the sum of angles");

        Scanner sc= new Scanner(System.in);
        int angles=sc.nextInt();

        if(angles==180){
            System.out.println("The triangle is valid");
        }else{
            System.out.println("The Triangle is not Valid");
        }
    }
}
