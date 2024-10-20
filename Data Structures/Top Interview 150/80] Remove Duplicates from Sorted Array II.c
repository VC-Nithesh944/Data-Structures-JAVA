int removeDuplicates(int* nums, int numsSize) {
    int i = 1;            //This pointer is used to assign elements and the first element is skipped.
    int count = 1;        //This variable is used to keep count of the elements.
    for (int j = 1; j<numsSize;j++){
        if (nums[j - 1] == nums[j]){
            count++;
        }
        else {
            count = 1;   //Resetting the count to 1 if new element is encountered.
        }

        if (count <= 2){
            nums[i] = nums[j];  //only copy the elements which appeared less than two times
            i++;
        }
    }
    return i;
}
