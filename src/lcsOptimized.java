class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int dp[]=new int [text2.length()+1];

        for(int i=0;i<=text2.length();i++)dp[i]=0;

        for(int i=1;i<=text1.length();i++){ int t[]=new int[text2.length()+1];
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    t[j]=1+dp[j-1];
                else{  t[j] = Math.max(dp[j], t[j-1]); }
            }dp=t.clone();
        }
        return dp[text2.length()]   ;
    }

}