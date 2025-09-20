import java.util.Scanner;
public class Area{
    public static void main(String[] args) {

        System.out.println("Enter the operation number \n 1)Area of Circle \n 2)Area of Square \n 3)Area of Rectangle \n ");
         Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();



        switch(num){

            case 1:{
                System.out.println("Enter the Radius of Circle");
                // Scanner sc=new Scanner(System.in);
                int radius=sc.nextInt();

                System.out.println("Area of Circle is:"+(3.14*radius*radius));
                break;
            }
             case 3:{
                System.out.println("Enter the Length and Breadth of Rectangle");
                // Scanner sc=new Scanner(System.in);
                int l=sc.nextInt();
                int b=sc.nextInt();

                System.out.println("Area of Rectangle is:"+(l*b));
                break;
            }
            case 2:{
                System.out.println("Enter the Length and Breadth of Rectangle");
                // Scanner sc=new Scanner(System.in);
                int side=sc.nextInt();

                System.out.println("Area of Square is:"+(side*side));
                break;
            }
            
            
            default:{
                System.out.println("Enter the Valid Operation");
            }
        }

    }
}
