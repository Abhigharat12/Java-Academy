public class Prime {
    public static void main(String[] args) {
        int limit = 100;

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is prime");
            }else{
                System.out.println(num + " is not prime");
            }
        }
    }
}
