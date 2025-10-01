class FunAll{


    public static void print(){
        System.out.println("Hii");
    }

    public static void operation(int a,int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

    }

   public static void fact(int n){
    int result = 1;
    for(int i=1; i<=n; i++){
        result *= i;
    }
    System.out.println("Factorial of " + n + " = " + result);
}


   public static void Rev(int n){
    int rev=0;
    while(n!=0){
        int lastdigit=n%10;
        rev = rev*10 + lastdigit;
        n = n/10;
    }
    System.out.println("Reversed: " + rev);
}


   public static void And(boolean a, boolean b){
    System.out.println("a && b = " + (a && b));
}

public static void ch(char ch){
    System.out.println((int)ch);
}

public static  void min(int a,int b,int c){

    if(a<b){
            System.out.println(a + " is Minimum");
        }
        else if(b<c){
            System.out.println(b + " is Minimum");
        }
        else{
            System.out.println( c + " is Minimum");
        }
    }

public static  void max(int a,int b,int c){

    if(a>b){
            System.out.println(a + " is Greater");
        }
        else if(b>c){
            System.out.println(b + " is Greater");
        }
        else{
            System.out.println( c + " is Greater");
        }
    }

       public static void Pin(int n){
    int Pin = n;
    if(Pin==1234){
    System.out.println("PIN Matched Successfully");
    }
}
       public static void bool(boolean val){
  
    if(val==true){
    System.out.println("Value is true");
    }else{
         System.out.println("Value is False");

    }
}





   public static void main(String[] args) {

    FunAll obj=new FunAll();

    obj.print();              
    obj.operation(2,4);        
    obj.fact(5);              
    obj.Rev(12345);         
   obj.And(true, false);    
   obj.ch('B');
   obj.min(12,23,34);
   obj.max(12,23,34);
   obj.Pin(1234);
   obj.bool(true);


} 

}