public class SumEO {

    public static void main(String[] args) {
    int evenSum=0;
    int oddSum=0;
    int limit=10;

    for(int i=0;i<=limit;i++){
        if(i%2==0){
            evenSum+=i;
        }else{
            oddSum+=i;
        }
    }
            System.out.println("Odd Sum is "+oddSum);
            System.out.println("Even Sum is "+evenSum);

    
}
}
