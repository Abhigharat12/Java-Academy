
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the first number ");
        int a=sc.nextInt();
        System.err.println("Enter the second number ");

        int b=sc.nextInt();

        System.err.println("Select Operation number \n 1)Addition \n 2)Substraction \n 3)Multipilcation \n 4)Division \n 5)Modulus");
        int inp=sc.nextInt();

        if(inp==1){
            System.err.println("The Addition is :"+(a+b));
        }
        else if(inp==2){
            System.err.println("The Substraction is :"+(a-b));
        }
        else if(inp==3){
            System.err.println("The Multiplication is :"+(a*b));
        }
        else if(inp==4){
            System.err.println("The Division is :"+(a/b));
        }
        else if(inp==5){
            System.err.println("The Modulus is :"+(a-b));
        }
        else{
            System.out.println("Operation is not available");
        }

        

    }
}
