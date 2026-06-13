
abstract class Car{
    public abstract void features();
    public void music(){
        System.out.println("Music playing..");
    }
}
class Toyota extends Car{
    public void features(){
        System.out.println("Good mileage, Safe, Strong");
    }
}
public class Demo {
    public static void main(String[] args) {
        //Car obj = new Car();  - not possible
        Toyota obj = new Toyota();
        obj.features();
        obj.music();
        
    }
}
