
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        System.err.println("Enter the name");
        Scanner sc =new Scanner(System.in);

         int num=sc.nextInt();

         if(num%5==0 ){
            System.err.println("The Number is divisble by 5 and the number is : "+num);
         }else if(num%11==0 ){
            System.err.println("The Number is divisble by 11 and the number is : "+num);
         }else{
            System.out.println("The number is not divisible 5 and 11 and the number is : "+num);
         }

        
    }
}
