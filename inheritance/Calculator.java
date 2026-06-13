
import tools.AdvCalc;
//import tools.*;  - this means import all classes of tools package

public class Calculator {
    
    public static void main(String[] args) {
        AdvCalc obj1 = new AdvCalc();
        System.out.println(obj1.add(12,4));
        System.out.println(obj1.sub(12,4));
        System.out.println(obj1.mul(12,4));
        System.out.println(obj1.div(12,4));
    }
}

// multiple inheritance is not possible in java