import java.util.Scanner;
public class sumOddEven {
    public static void main (String[] args){

        Scanner sc=new Scanner(System.in);
        
        int number;
        int choice;

        int evensum=0;
        int oddsum=0;

        do { 
            System.out.println("Enter the Number");
            number=sc.nextInt();

            if(number%2==0){
                evensum+=number;
                System.out.println("Even Sum:"+evensum);
            }else{
                oddsum=oddsum+number;
                System.out.println("Odd Sum :"+oddsum);
  

            }
            System.out.println("Do you want continue \n1.Yes \n2.No");
                choice=sc.nextInt();
            
        } while (choice==1);;
    }
}