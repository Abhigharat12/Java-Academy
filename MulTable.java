
import java.util.Scanner;
public class MulTable {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find Multilication able");
        int number=sc.nextInt();
        System.out.println("Enter the range for the table");
        int range=sc.nextInt();
        for(int i=1;i<=range;i++){
            System.out.println(number+" * "+i+" = "+(number*i));
        }for(int i=1;i<=range;i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }
        




    }
}
