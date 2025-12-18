class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length(),m=s.length();
        StringBuilder ss=new StringBuilder(s);
        String s2=new String(ss.reverse());
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)Arrays.fill(dp[i],-1);
        return rec(s,s2,n,m,dp);
    }
    public static int rec(String s ,String s2,int i,int j,int dp[][]){
        if(i==0 ||j==0){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];

        if(s.charAt(i-1)==s2.charAt(j-1)){
            return dp[i][j]=1+rec(s,s2,i-1,j-1,dp);
        }
        else return dp[i][j]=Math.max(rec(s,s2,i-1,j,dp),rec(s,s2,i,j-1,dp));
    }
}