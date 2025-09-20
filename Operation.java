

import java.util.Scanner;
public class Operation{
    public static void main(String[] args) {
        
        System.out.println("Enter the operation number \n 1)Addition \n 2)Substraction \n 3)Multilication \n 4)Division");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();

        switch(num){

            case 1:{
                System.out.println("The Addition of Number is:"+(a+b));
                break;
            }
            case 2:{
                System.out.println("The Substraction of Number is:"+(a-b));
                 break;
            }
            case 3:{
                System.out.println("The Multiplication of Number is:"+(a*b));
                 break;
            }
            case 4:{
                System.out.println("The Division of Number is:"+(a/b));
            }
            default:{
                System.out.println("Enter the Valid Operation");
            }
        }

    }
}