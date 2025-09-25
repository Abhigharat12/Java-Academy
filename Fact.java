public class Fact {
    
    public static void main(String[] args){

        int num=79;
        

            if(num==1 || num==0){
                System.out.println("Factorial is 1");
            }
            else{
                int fact=1;
                for(int i=2;i<=num;i++){
                    fact=fact*i;
                }
                System.out.println("Factorial is "+fact);
            }
        }

    }

