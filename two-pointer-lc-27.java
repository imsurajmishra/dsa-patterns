// brute-force
public int removeElementBruteForce(int[] nums, int val) {
    int n = nums.length;
    int length = n; // Start with the original length of the array
    
    for (int i = 0; i < length; i++) {
        if (nums[i] == val) {
            // Shift all elements to the left
            for (int j = i; j < length - 1; j++) {
                nums[j] = nums[j + 1];
            }
            // Reduce the effective array length
            length--;
        }
    }
    
    return length;
}

// optimized: two pointer
public int removeElement(int[] nums, int val) {
    int leftPointer = 0;
    for(int rightPointer = 0; rightPointer< nums.length; rightPointer++){
        if(nums[rightPointer]!=val){
            nums[leftPointer] = nums[rightPointer];
            leftPointer += 1;
        }
    }

    return leftPointer;
}
