package Leetcode.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max =-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
