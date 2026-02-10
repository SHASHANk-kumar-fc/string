class NumArray {
    int nums[];
    public NumArray(int[] nums) {
        this.nums=nums;
    }

    public int sumRange(int left, int right) {
        int ans[]=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++)
            ans[i]=ans[i-1]+nums[i];
        if(left==0)return ans[right];
        return ans[right]-ans[left-1];
    }
}
