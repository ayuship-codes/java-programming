
class A implements Runnable{
    public void run(){
        System.out.println("Thread A..");
    }
}
class B implements Runnable{
    public void run(){
        System.out.println("...Thread B..");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        A t1 = new A();
        Thread a1 = new Thread(t1);
        B t2 = new B();
        Thread b2 = new Thread(t2);
        a1.start();
        b2.start();
    }
}
