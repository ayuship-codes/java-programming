/*
abstract class Computer{
    abstract void feature();
}
class Laptop extends Computer{
    public void feature(){
        System.out.println("Portable, Convenient");
    }
}
class Desktop extends Computer{
    public void feature(){
        System.out.println("Faster, Strong");
    }
}
class Developer{
    public void dev(Computer obj){
        System.out.println("Developing...");
    }
}
public class Demo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        desk.feature();

        Developer obj1 = new Developer();
        obj1.dev(lap);
        
    }
}
*/

interface Computer{
    void feature();
}
class Laptop implements Computer{
    public void feature(){
        System.out.println("Portable, Convenient");
    }
    
}
class Desktop implements Computer{
    public void feature(){
        System.out.println("Faster, Strong");
    }
}
class Developer {
    public void dev(Computer obj){
        System.out.println("Developing...");
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        desk.feature();

        Developer obj1 = new Developer();
        obj1.dev(lap);
     
        
    }
}
