
class Demo{
    private String name;
    private int age;

    public void setName(String n){   //or public void setName(String name){
        name = n;                    //or      this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }

}
public class Encap1 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.setName("Rahul");
        d1.setAge(24);
        System.out.println(d1.getAge());
        System.out.println(d1.getName());
    }
}
