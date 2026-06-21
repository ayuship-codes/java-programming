
class A extends Thread{
    public A(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println(" A Running...");
        System.out.println(" thread name : "+ this.getName());
    }
}
class B implements Runnable{
    
    @Override
    public void run(){
        System.out.println(" B Running...");
    }
}
public class ThreadConstr {
    public static void main(String[] args) {
        A t1 = new A("Jenny");
        t1.start();
        System.out.println("This thread name is "+ t1.getName());
        System.out.println("This thread id is "+ t1.getId());

        B t2 = new B();
        Thread b1 = new Thread(t2, "Shelly");
        b1.start();
        System.out.println("This thread name is "+ b1.getName());
        System.out.println("This thread id is "+ b1.getId());
    }
}
