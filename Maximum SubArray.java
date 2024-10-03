class Solution {                                 //Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            if (maxi<sum){
                maxi= sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}
