public class Avg {

    public static float Average(int a, int  b, int  c,int  d,int  e){
        float average=(a+b+c+d+e)/5;
        return average;

    }
    public static void main(String[] args) {

        float average=Average(1,2,3,4,5);
        System.out.println("The Average is "+average);
        
    }
}
