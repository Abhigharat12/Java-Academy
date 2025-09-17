
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter the angles of traingles");

        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a==60 && b==60 && c==60){
            System.out.println("The triangle is Equilateral Triangle");
        }else{
            System.out.println("The Triangle is not Equilateral Traingle");
        }
    }
}
