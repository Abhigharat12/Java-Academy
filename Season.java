
import java.util.Scanner;
public class Season {
    public  static void main(String[] args){

        System.out.println("Enter the Month");
        Scanner sc=new Scanner(System.in);
        String month =sc.next();

        switch(month){

            case "january":
            case "february":
            case "december":{
                System.out.println("The Season is Winter");
                break;
            }
            case "march":
            case "april":
            case "may":{
                System.out.println("The Season is Summer");
                break;
            }
            case "june":
            case "july":
            case "august":{
                System.out.println("The Season is Rainy");
                break;
            }
            case "september":
            case "october":
            case "november":{
                System.out.println("The Season is Autum");
                break;
            }
            default:{
                System.out.println("Enter the Valid Month");
            }
        }
    }
}
