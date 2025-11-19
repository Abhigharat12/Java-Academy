import java.util.*;
public class StrFruit {

    public static void main(String[] args){
        System.out.println("Enter Fruit");
        Scanner sc=new Scanner(System.in);
        String fruit=sc.nextLine();


        for(int i=0;i<fruit.length();i++){
            char a=fruit.charAt(i);
            if(a=='p' || a=='m'){
                System.out.println("Fruit is not Valid");
                break;
            }else{
                System.out.println("Its Fruit");
                break;

            }
        }
      

        
    }
    
}
