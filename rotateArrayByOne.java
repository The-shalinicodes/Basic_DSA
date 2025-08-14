class Solution {
    public void rotateArrayByOne(int[] nums) {
         int first = nums[0];

        // Shift elements to the left
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        // Place first element at the end
        nums[nums.length - 1] = first;
    }
}