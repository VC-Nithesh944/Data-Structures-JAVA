class Solution {                                                      //The O(n) solution for Two sum problem Using HashMap in java
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (!numMap.containsKey(target - nums[i])) {
                numMap.put(nums[i], i);
                
            }
            else{
                return new int[] { numMap.get(target - nums[i]), i };
            }
        }
        return null;
    }
}
