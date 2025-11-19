public class Digit {
    public static boolean digit(int number){
        int  di=0;
        int num=number;
        while(num>0){
            num=num/10;
            di++;
        }
        return di==2;
    }
    public static void main(String[] args){

        System.out.println(digit(156));

    }
}
