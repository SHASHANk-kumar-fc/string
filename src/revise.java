class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n=s1.length();
        int dp[][]=new int[s1.length()][s2.length()];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        return rec(s1,s2,n-1,s2.length()-1,dp);
    }
    public static int rec(String s1,String s2,int i,int j,int[][]dp){
        if(i<0 ||j<0){

            return 0;
        }if(dp[i][j]!=-1)return dp[i][j];
        int val=0;
        if(s1.charAt(i)==s2.charAt(j))
            return dp[i][j]=val=1+rec(s1,s2,i-1,j-1,dp);
        int left=rec(s1,s2,i-1,j,dp);
        int right=rec(s1,s2,i,j-1,dp);
        return dp[i][j]=Math.max(left,right);

    }
}