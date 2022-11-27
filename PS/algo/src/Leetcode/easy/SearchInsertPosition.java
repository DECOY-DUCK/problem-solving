package Leetcode.easy;


public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)>>>1;
            if(nums[mid]<target){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}
