class Solution {
  public int sumHighestAndLowestFrequency(int[] nums) {
    int n = nums.length;
    int maxFreq = 0;
    int minFreq = n;
    boolean[] visited = new boolean[n];
    for (int i = 0; i < n; i++) {
      if (visited[i]) continue;

      int freq = 0;
      for (int j = i; j < n; j++) {
        if (nums[i] == nums[j]) {
          freq++;
          visited[j] = true;
        }
      }
      maxFreq = Math.max(maxFreq, freq);
      minFreq = Math.min(minFreq, freq);
    }
    return maxFreq + minFreq;
  }
}
