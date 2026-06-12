package loops;
public class loops2 {
    public static void main(String[] args) {
        for (int i=1 ; i<=5 ; i++){
            System.out.println("Day " + i);
            for(int j=1; j<=9; j++){
                System.out.println("  " + (j+8) + "-" + (j+9));
            }
        }
    }
}

// This is also valid syntax in java
// int i=1;
//for(;i<=5;){
//    //statement
//    i++;
//}