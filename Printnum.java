import java.util.*;
public class Printnum{
    public static void main(String[] args) {
        
            // printing the number

        System.err.println("Enter the Number  ");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int counter=0;
        int sum=0;

        while(counter<=num){
            System.err.println("The Number is "+counter);
            counter=counter+1;
            sum+=counter;
        }
        sc.close();
    }
}