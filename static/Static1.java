
class Student{
    int rollno;
    String name;
    static String branch;         // it will be common for all objects

    public void show(){
        System.out.println("rollno.: "+ rollno + "  ,Name: " + name + "  ,Branch: "+ branch);
    }
}
public class static1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno=01;
        s1.name="Neha";
        Student.branch="CSE";
        //s1.branch="CSE";

        Student s2 = new Student();
        s2.rollno=02;
        s2.name="Rajat";
        //s2.branch="ECE";

        s1.show();
        s2.show();
        
    }
}
