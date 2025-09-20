public class EvenOdd{
    public static void main(String[] args){
        int number=20;

        if(number%2==0){

            if(number>=10 && number<=99){
                System.out.println("Two digit even number");
            }else{
                System.out.println("The number is even but not two digit");
            }
        }else{
            if(number>50000){
                System.out.println("The number is greater that 50000 and odd");
            }
            else{
                System.out.println("The number is less than 50000 and odd");
            }

        }
    }
}