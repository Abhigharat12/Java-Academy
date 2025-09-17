
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter the week number");
        Scanner sc =new Scanner(System.in);
        int Day =sc.nextInt();

        if(Day==1){
            System.out.println("Monday");
        }
        else if(Day==2){
            System.out.println("Tuesday");
        }
        else if(Day==3){
            System.out.println("Wednesday");
        }else if(Day==4){
            System.out.println("Thursday");
        }else if(Day==5){
            System.out.println("Friday");
        }else if(Day==6){
            System.out.println("Saturday");
        }else if(Day==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Enter the Valid number");
        }
}
}