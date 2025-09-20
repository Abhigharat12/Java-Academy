// public class PrimeNum{

//     public static void main(String[] args) {
//         int num=7;
//         int div=2;
//         boolean isPrime=true;

//         if(num <= 1){
//             isPrime = false;
//         } else {
//             while(div * div <= num){
//                 if(num % div == 0){
//                     isPrime = false;
//                     break;
//                 } else {
//                     div = div + 1;
//                 }
//             }
//         }

//         if(isPrime){
//             System.out.println("The number is prime");
//         }else{
//             System.out.println("The number is not prime");
//         }
//     }
// }


public class PrimeNum{

    public static void main(String[] args) {
        int num=30;
        int div=2;
        boolean isPrime=true;


        if(num<1){
            System.out.println("The number is not prime");
        }else{

        while(div*div<=num){
            if(num%div==0){
                isPrime=false;
                break;
            }else{
                div=div+1;

            }
        }

    }

    if(isPrime){
        System.out.println("The number is prime");
    }
    else{
        System.out.println("The number is not prime");
    }
}
}



