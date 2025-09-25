public class Div3and5 {
    public static void main(String[] args){
    

    int num=50;

    for(int i=0;i<=num;i++){
        if(i%3==0){
            System.out.println("fizz Number "+i);

        }
        else if(i%5==0){
            System.out.println("Buzz Number "+i);
        }
        else
        {
            System.out.println("Number "+i);
        }
}
}
}