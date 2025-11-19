public class PalindromeStr{

    public static void PalindromeCheck(String str){
        boolean isPal=true;

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                isPal=false;
                break;
            }
        }
        if(isPal){
            System.out.println("The String is  Palindrome");
        }else{
            System.out.println("The String is not Palindrome");
        }
    }
    public static void main(String[] args){
        String str="abhihba";
        PalindromeCheck(str);

    }

}