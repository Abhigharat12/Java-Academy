import java.util.*;
public class StrFrie {

    public static void main(String[] args){
        System.out.println("Enter names of 5 friends:");
        Scanner sc = new Scanner(System.in);
        String[] friends = new String[5];
        
        for(int i = 0; i < 5; i++){
            friends[i] = sc.nextLine();
        }
        
        System.out.println("Friends names starting with 'K':");
        for(int i = 0; i < friends.length; i++){
            if(friends[i].startsWith("K") || friends[i].startsWith("k")){
                System.out.println(friends[i]);
            }
        }
        
        sc.close();
    }
    
}
