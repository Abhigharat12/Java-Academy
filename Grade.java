import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {

        System.out.println("Enter the Grade");
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);


        switch(ch){
            case 'A':{
                System.out.println("Your Grade is Excellent");
                break;
            }
            case 'B':{
                System.out.println("Your Grade is Good");
                break;
            }
            case 'C':{
                System.out.println("Your Grade is Average");
                break;
            }
            case 'D':{
                System.out.println("Your Grade is Poor");
                break;
            }
            case 'E':{
                System.out.println("Your Grade is Fail");
                break;
            }


            default:
                System.out.println("Grade Not Matched");
              
        }
    }
}

