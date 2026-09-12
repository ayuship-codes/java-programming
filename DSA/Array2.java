import java.util.*;

public class Array2{
    public static int trappedWater(int barHeight[]){

        int n = barHeight.length;

        int leftMax[] = new int[n];
        leftMax[0] = barHeight[0];

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(barHeight[i] , leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = barHeight[n-1];

        for(int i=n-2; i>=0 ; i--){
            rightMax[i] = Math.max(barHeight[i] , rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0 ; i<n ; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel - barHeight[i];
        }
        return trappedWater;
    }

    public static void main(String args[]){
        int bars[] = {2,4,6,1,9,3,5};
        System.out.println(trappedWater(bars));
    }
}