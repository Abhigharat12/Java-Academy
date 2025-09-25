public class Div7 {
    public static void main(String[] args) {
        int count=0;
        int limit=200;
        for(int i=0;i<=limit;i++){
            if(i%7==0){
                count++;
            }
        }
        System.out.println("Total numbers divisible by 7 from 1 to "+limit+" are "+count);
    }
}
