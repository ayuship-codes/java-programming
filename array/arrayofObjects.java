class Student{
    int rollno;
    String name;
    int age;
}
public class arrayofObjects {
    public static void main(String[] args) {
        

        Student s1 = new Student();
        s1.rollno=101;
        s1.name="Rahul";
        s1.age=12;

        Student s2 = new Student();
        s2.rollno=102;
        s2.name="priya";
        s2.age=14;

        Student s3 = new Student();
        s3.rollno=104;
        s3.name="sam";
        s3.age=15;

        Student stu[] = new Student[3];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        for(int i=0; i<stu.length;i++){
            System.out.println("Rollno.->"+stu[i].rollno +"  Name->"+stu[i].name+"  Age->"+ stu[i].age);
        }

        System.out.println();
        
        //OR
        for(Student n : stu){
            System.out.println("Rollno.->"+n.rollno +"  Name->"+n.name+"  Age->"+ n.age);
        }
    }
}
