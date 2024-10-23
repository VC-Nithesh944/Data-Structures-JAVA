//I had used brute force for this problem when i solved it first time and it passed 37 testcases.
//This has a runtime of 2ms in java and Time Complexity of O(N).
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1){
            return;
        }

        k = k % nums.length;              // the case where k is greater than nums.length

        reverse(nums,0, nums.length-1);   //First reverse the entire array
        reverse(nums,0,k-1);              //reverese the first k elements
        reverse(nums,k,nums.length-1);    // reverse the remaining element
    }

    public void reverse(int nums[],int start , int end){
        int temp ;
        while(start<end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
