import java.util.*;
public class StrLogin {

    public static void main(String[] args){
        System.out.println("Enter Username");
        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();
        System.out.println("Enter Password");
        String pass=sc.nextLine();

        String username="Abhishek";
        String Pass="abhi123";

        if(username.equals(user) && Pass.equals(pass)){
            System.out.println("Successfull Login");
        }
    }
    
}
