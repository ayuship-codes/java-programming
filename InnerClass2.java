class A{
    int n=10;
    public void show(){
        System.out.println(n);
    }
    static class B{
        public void show1(){
            System.out.println("Inside A");
        }
    }
}
public class InnerClass2 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

       // A.B obj2 = new A.B(); not possible
       A.B obj2 = new A.B();
       obj2.show1();
    }
}
