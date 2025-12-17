class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length(),m=s.length();

        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)Arrays.fill(dp[i],-1);
        return rec(s,0,s.length()-1,dp);
    }
    public static int rec(String s ,int i,int j,int dp[][]){
        if(i==j){
            return 1;
        }if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];

        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=2+rec(s,i+1,j-1,dp);
        }
        else return dp[i][j]=Math.max(rec(s,i+1,j,dp),rec(s,i,j-1,dp));
    }
}