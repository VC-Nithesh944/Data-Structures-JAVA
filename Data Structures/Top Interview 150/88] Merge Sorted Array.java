//This program has 0ms runtime and time complexity of O(m+n).
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;                                             //last index of nums2
        int j = n - 1;                                             //last valid index of nums1
        int k = m + n - 1;                                         //last index of nums1

        while (i >= 0 && j >= 0){
            if (nums1[i] < nums2[j]){
                nums1[k--] = nums2[j--];
            }
            else {
                nums1[k--] = nums1[i--];
            }
        }
        while (j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
