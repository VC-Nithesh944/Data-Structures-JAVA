//This has runtime of 1ms in java but Time Complexity is O(N) and Space complexity is O(1).
//I used Kadane's algorithm to solve this problem

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = -10000;                      //Assigning the minimum possible constraint
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            if (max<sum){                      //if max is less than sum then sum value is given to max
                max= sum;                      
            }
            if(sum<0){
                sum=0;                         //when sum value goes below 0 because of the negative numbers in the subarray
            }                                  // we ignore the subarray by reinitialising the sum to 0 and start with remaining
        }
        return max;
    }
}
