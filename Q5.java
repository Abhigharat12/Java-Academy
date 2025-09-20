
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter the week number");
        Scanner sc =new Scanner(System.in);
        int Month =sc.nextInt();

        if(Month==1){
            System.out.println("Month has 31 Days");
        }
        else if(Month==2){
            System.out.println("Month has 28 or 29 Days");
        }
        else if(Month==3){
            System.out.println("Month has 31 Days");
        }else if(Month==4){
            System.out.println("Month has 30 Days");
        }else if(Month==5){
            System.out.println("Month has 31 Days");
        }else if(Month==6){
            System.out.println("Month has 30 Days");
        }else if(Month==7){
            System.out.println("Month has 31 Days");
        }else if(Month==8){
            System.out.println("Month has 31 Days");
        }else if(Month==9){
            System.out.println("Month has 30 Days");
        }else if(Month==10){
            System.out.println("Month has 31 Days");
        }else if(Month==11){
            System.out.println("Month has 30 Days");
        }else if(Month==12){
            System.out.println("Month has 31 Days");
        }
        else{
            System.out.println("Enter the Valid Month");
        }
}
}