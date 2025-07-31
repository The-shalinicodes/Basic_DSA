class Solution {
  public int mostFrequentElement(int[] nums) {
    int n = nums.length;
    int maxEle = 0;
    int maxFreq = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    for (Map.Entry<Integer, Integer> it : map.entrySet()) {
      int freq = it.getValue();
      int ele = it.getKey();
      if (freq > maxFreq) {
        maxFreq = freq;
        maxEle = ele;
      } else if (freq == maxFreq) {
        maxEle = Math.min(maxEle, ele);
      }
    }
    return maxEle;
  }
}
