class Solution {
    // Function to move zeroes to the end
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        // Create a temporary array to store non-zero elements
        int[] temp = new int[n];
        int count = 0;

        // Copy non-zero elements to temp
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[count++] = nums[i];
            }
        }

        // Copy non-zero elements back to nums
        for (int i = 0; i < count; i++) {
            nums[i] = temp[i];
        }

        // Fill the rest with zeroes
        for (int i = count; i < n; i++) {
            nums[i] = 0;
        }
    }
}