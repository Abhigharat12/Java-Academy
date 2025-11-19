public class StudentD {
    private int marks;
    private int roll;

    public int getmarks(){
        return marks;
    }
    public void setmarks(int marks){
        this.marks=marks;
    }
    public int getroll(){
        return roll;
    }
    public void setroll(int roll){
        this.roll=roll;
    }

    public static void Display(int marks,int roll){
        System.out.println("Marks: "+marks);
        System.out.println("Roll No: "+roll);
    }
    public static void main(String[] args){
        StudentD s=new StudentD();

        s.setmarks(81);
        s.setroll(1);
        

    }
}
