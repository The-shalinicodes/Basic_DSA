class Solution {
  public int secondMostFrequentElement(int[] nums) {
    int n = nums.length;

    int maxFreq = 0, maxEle = -1;
    int secMaxFreq = 0,secMaxEle = -1;

    boolean[] visited=new boolean[n];

    for(int i=0;i<n;i++){
        if(visited[i]) continue;
    

    int freq=0;

    for(int j=i;j<n;j++){
        if(nums[i]==nums[j]){
            freq++;
            visited[j]=true;
        }
    }
    if (freq > maxFreq) {
        secMaxFreq = maxFreq;
        secMaxEle = maxEle;
        maxFreq = freq;
        maxEle = nums[i];
      } else if (freq ==maxFreq) {
        maxEle=Math.min(maxEle,nums[i]);
      } else if (freq > secMaxFreq) {
        secMaxFreq=freq;
        secMaxEle=nums[i];
      }
      else if(freq==secMaxFreq){
        secMaxEle=Math.min(secMaxEle,nums[i]);
      }
    }
    return secMaxEle==0?-1:secMaxEle;
  }  
}

