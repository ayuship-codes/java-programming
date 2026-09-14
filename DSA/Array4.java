public class Array4 {
    public static int findIndex(int nums[], int target){
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int nums[] = {1,3,2,8,3,10,5};
        System.out.println(findIndex(nums, 9));
    }
}
