public class Msg53 {
    public static void main(String[] args){
    

    int num=30;

    for(int i=0;i<=num;i++){
        if(i%3==0 && i%5==0 ){
            System.out.println("HelloWorld");

        }
        else if(i%3==0){
            System.out.println("Hello");
        }
        else if(i%5==0){
            System.out.println("World");
        }
        else
        {
            System.out.println("Number "+i);
        }
}
}
}