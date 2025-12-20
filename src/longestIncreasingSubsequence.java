class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int [nums.length+1][nums.length+1];
        for(int i=0;i<=nums.length;i++)Arrays.fill(dp[i],-1);
        return rec(nums,-1,0,dp);
    }
    public static int rec(int []nums,int prev,int i,int [][]dp){
        if(i==nums.length)
            return 0;
        if(dp[i][prev+1]!=-1)return dp[i][prev+1];
        int t=0;
        if( prev == -1 ||nums[i]>nums[prev])
            t=1+rec(nums,i,i+1,dp);
        int n=rec(nums,prev,i+1,dp);
        return dp[i][prev+1]=Math.max(n,t);
    }
}