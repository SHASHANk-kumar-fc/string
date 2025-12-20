class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int dp[]=new int[nums.length];
        int h[]=new int [nums.length];
        Arrays.sort(nums);
        Arrays.fill(dp,1);
        int temp=1,index=0;
        for(int i=1;i<nums.length;i++){
            h[i]=i;
            for(int prev=0;prev<i;prev++){
                if(nums[prev]!=0 &&nums[i]%nums[prev]==0 && dp[prev]+1>dp[i]){
                    dp[i]=dp[prev]+1;
                    h[i]=prev;
                }
            }if (dp[i] > temp) {
                temp = dp[i];
                index = i;
            }
        }

        while(temp>0){

            l.add(nums[index]);
            index=h[index];temp--;
        }return l;
    }
}