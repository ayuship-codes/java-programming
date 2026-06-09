

public class array3d {
    public static void main(String[] args) {
        int arr[][][] = new int[3][4][3];
        for(int i=0;i<3;i++){
         for(int j=0;j<4;j++){
            for(int k=0;k<3;k++){
               arr[i][j][k] = (int) (Math.random()*10);
            }
         }
        } 

        for(int n[][]: arr){
          for(int m[]: n){
            for(int s: m){
              System.out.print(s + " ");
            }
            System.out.println();
          }
          System.out.println();
        }
    }
}
