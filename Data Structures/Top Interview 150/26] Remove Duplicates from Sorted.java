//I solved this after seeing three hints
//But i got it to have Oms runtime in Java and Time complexity of O(N) but this has 2ms runtime in C.
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;      //The first element is always unique, I made a mistake here by initialising it to 0.
        int i = 0;
        for (int j = 1; j < nums.length ; j++){
            if (nums[i] != nums[j]){
                nums[++i] = nums[j];
                k++;
            }
        }
        return k;     //Here the output it displayed taking k as size.
    }
}
