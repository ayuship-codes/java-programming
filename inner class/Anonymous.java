class A{
    public void show(){
        System.out.println("Inside A show");
    }
}
class Anonymous{
    public static void main(String[] args) {
       A obj = new A(){
            public void show(){
            System.out.println("Inside Anonymous inner class show");
        }
       };
       obj.show();     //Inside Anonymous inner class show
    }
}