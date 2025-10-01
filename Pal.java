public class Pal {

    public static boolean palindrome(int num){
        int originalnum=num;
        int rev=0;
        while(num!=0){
            int lastdigit=num%10;
            rev=rev*10+lastdigit;
            num=num/10;
            
        }
        return originalnum==rev;
    }
    public static void main(String[] args) {
        palindrome(121);
        System.out.println( palindrome(1234));
        
    }
}
