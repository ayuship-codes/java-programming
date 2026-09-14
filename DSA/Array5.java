// buy and sell stock

import java.util.*;

public class Array5 {
    public static void maxProfit(int arr[]){
        int mxprofit = Integer.MAX_VALUE;
        int minVal = 0;
        for(int i=0; i<arr.length; i++){
            if(minVal<arr[i]){
                minVal = arr[i];
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
