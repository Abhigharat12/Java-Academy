public class HalChar{
    public static void main(String[] args) {
        int num=5;
        char ch='A';

        for(int line=1;line<=num;line++){
            for(int number=1;number<=line;number++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
