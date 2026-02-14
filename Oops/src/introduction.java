class student{
    int roll_no;
    String name;
    float marks;



    // constructor
     student(int roll,String nam,float mark){
        this.roll_no=roll;
        this.marks=mark;
        this.name=nam;
    }

    student() {
    }
}

public class introduction {
    public static void main(String[] args) {
      student rahul=new student(23,"rahul yadav",23);
        System.out.println(rahul.roll_no);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
        final student rahul1=new student(23,"rahul yadav",23);
       // rahul1=new student(23,"rahul yadav",23);;//we can not assign again same object we pre declaere as final
        rahul1.name="vaibhav";
        rahul1.name="rishu";//can be override it.
        System.out.println(rahul1.name);

    }

}