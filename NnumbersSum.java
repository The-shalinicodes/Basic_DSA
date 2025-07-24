class Solution {
    public int NnumbersSum(int N) {
        return Sum(N);
    }
    public static int Sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}