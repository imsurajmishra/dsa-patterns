// Brute force
public int removeDuplicatesBruteForce(int[] nums) {
    int n = nums.length;
    if (n == 0) return 0; // Edge case: empty array
    
    int length = n;
    for (int i = 0; i < length - 1; i++) {
        // If a duplicate is found
        if (nums[i] == nums[i + 1]) {
            // Shift all elements to the left
            for (int j = i + 1; j < length - 1; j++) {
                nums[j] = nums[j + 1];
            }
            // Reduce the effective array length
            length--;
        }
    }
    return length;
}




// Optimized: Two Pointer
public int removeDuplicates(int[] nums) {
        int leftPointer = 0;
        for(int rightPointer=1; rightPointer < nums.length; rightPointer++){
            if(nums[leftPointer] != nums[rightPointer]){
                leftPointer += 1;
                nums[leftPointer] = nums[rightPointer];
            }
        }

        return leftPointer+1;
}
