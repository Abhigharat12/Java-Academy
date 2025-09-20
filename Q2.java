import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {


       
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first numbers");
        int a=sc.nextInt();
        System.out.println("Enter the second numbers");
        int b=sc.nextInt();
        System.out.println("Enter the second numbers");
        int c=sc.nextInt();

        if(a>b && a>c){
                System.out.println("The Greater Number is :"+a);     
        }else if(b>a && b>c){
                System.out.println("the Greater Number is :"+b);
        }else{
                System.out.println("the Greater Number is :"+c);
            
        }
    }
    
}
 