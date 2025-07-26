class Solution {    
    public String largeOddNum(String s) {
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if((c-'0')%2==1){
                return s.substring(0,i+1).replaceFirst("^0+(?!$)","");
            }
        }
        return "";
    }
}