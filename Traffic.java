import java.util.Scanner;
public class Traffic {
    public static void main(String[] args) {

        System.out.println("Enter the Traffic Light Color");
        Scanner sc=new Scanner(System.in);
        String str = sc.next();


        switch(str){
            case "RED":
            case "red": {
                System.out.println("STOP");
                break;
            }
            case"orange":
            case "ORANGE":{
                System.out.println("Get Ready");
                break;
            }
            case"green":
            case "GREEN":{
                System.out.println("GO");
                break;
            }


            default:
                System.out.println("The Road is Open to GO");
              
        }
    }
}

