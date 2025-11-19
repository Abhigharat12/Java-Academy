import java.util.*;
public class Strdig {

    public static void main(String[] args){
        System.out.println("Enter Something");
        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();

        int digitCount = 0;
        int alphabetCount = 0;

        for(int i = 0; i < user.length(); i++){
            char c = user.charAt(i);
            if(c >= '0' && c <= '9'){
                digitCount++;
            } else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                alphabetCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of alphabets: " + alphabetCount);

    }
    
}
