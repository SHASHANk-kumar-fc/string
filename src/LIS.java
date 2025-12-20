class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int [nums.length+1][nums.length+1];
        int n=nums.length;

        for(int i=n-1;i>=0;i--){
            for(int prev=i-1;prev>=-1;prev--){
                int t=0;
                if(prev==-1 ||nums[i]>nums[prev])
                    t=1+dp[i+1][i+1];
                int no=dp[i+1][prev+1];
                dp[i][prev+1]=Math.max(t,no);
            }
        }
        return dp[0][0];
    }

}