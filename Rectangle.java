public class Rectangle {
    double length;
    double width;


    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public void Area(){
        System.out.println("Area of rectangle is : "+(length*width));
    }

    public static void main(String[] args){
        Rectangle r1=new Rectangle(10,20);
        r1.Area();

        Rectangle r2=new Rectangle(12,22);
        r2.Area();

        
    }
    
}
