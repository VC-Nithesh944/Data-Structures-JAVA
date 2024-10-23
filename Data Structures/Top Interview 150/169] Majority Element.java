//This solution has a runtime of 1ms beats 98%, having Time complexity of O(N) and Space complexity O(1).
//This utilises Boyer - Moore Voting Algorithm.

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int i = 0 ; i < nums.length; i++){
            if (count == 0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
