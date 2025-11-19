class Student {
    String name;
    int rollNo;
    double marks;

    // Constructor to initialize student details
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }


    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
      
        Student s1 = new Student("Aarav", 1, 89.5);
        Student s2 = new Student("Priya", 2, 92.0);
        Student s3 = new Student("Rahul", 3, 76.8);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
