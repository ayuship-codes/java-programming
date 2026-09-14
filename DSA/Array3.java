import java.util.*;

public class Array3 {
    public static boolean repeatingElement(int nums[]){
        for(int i=0;i<nums.length;i++){
           
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String []args){
        //int nums[] = {1,3,4,2,1};
        int nums[] = {1,3,4,2};
        System.out.println(repeatingElement(nums));

        
    }
}
