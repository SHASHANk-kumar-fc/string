class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length(),m=t.length();
        int [][]dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
            Arrays.fill(dp[i],-1);
        return rec(s,t,dp,n,m);
    }
    public static int rec(String s,String t,int [][]dp,int i,int j){
        if(j==0)return 1;
        if(i==0)return 0;

        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i-1)==t.charAt(j-1))
            return dp[i][j]=rec(s,t,dp,i-1,j-1)+rec(s,t,dp,i-1,j);
        else
            return dp[i][j]=rec(s,t,dp,i-1,j);
    }
}