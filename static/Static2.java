

class Student{
    int rollno;
    String name;
    static String branch;         // it will be common for all objects
    static{
        branch= "CSE";
    }

    // static method can only access static variable
    // static method can access normal variable by object reference only
    public static void show(Student obj){
        System.out.println("rollno.: "+ obj.rollno + "  ,Name: " + obj.name + "  ,Branch: "+ branch);
    }
}
public class static2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno=01;
        s1.name="Neha";
        //Student.branch="CSE";
        //s1.branch="CSE";

        Student s2 = new Student();
        s2.rollno=02;
        s2.name="Rajat";
        //s2.branch="ECE";

        s1.show(s1);
        s2.show(s2);
        
    }
}