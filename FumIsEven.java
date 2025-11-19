public class FumIsEven {

    public static boolean IsEven(int n){

        boolean checkiseven =true;
        if(n%2==0){
            checkiseven = false;
        }
        return checkiseven;
        
    }    
    public static void main(String[] args){
        IsEven(12);


    }
}
