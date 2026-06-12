class A{
    public A(){        // super class extends 'Object' class of java
        super();
        System.out.println("inside A");
    }
    public A(int n){
        super();
        System.out.println("inside A int "+ n);
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("inside B");
    }
    public B(int n){
        this();      //inside A
                     //inside B
                     //inside B int 4
       // super(n);    //inside A int 4
                     //inside B int 4
        System.out.println("inside B int "+ n);
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B(4);
    }
}
