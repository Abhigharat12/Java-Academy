import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {

        System.out.println("Enter the Alphabet");
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);


        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The alphabet " + ch + " is Vowel");
                break;

            default:
                System.out.println("The Alphabet " + ch + " is Consonant");
        }
    }
}
