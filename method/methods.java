package method;
class Service{
    public String buyPen(int cost){
        if(cost>=10)
            return "get Pen";
        else
            return "Nothing";
    }

    public void playMusic(){
        System.out.println("Playing music...");
        
    }
}
public class methods {
    public static void main(String[] args) {
        Service obj = new Service();
        System.out.println(obj.buyPen(5));
        obj.playMusic();
    }
}
