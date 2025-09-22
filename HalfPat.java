public class HalfPat{
    public static void main(String[] args) {
        
        int num=5;

        for(int line=1;line<=num;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}