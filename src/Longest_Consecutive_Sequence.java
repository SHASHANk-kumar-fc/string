class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer>set=new HashSet<>();
        int count=0,max=0;
        for(int i=0;i<nums.length;i++){

            set.add(nums[i]);
        }for(int i:set){
            if(!set.contains(i-1))
                max=Math.max(max,rec(set,i,1));
        }
        return max;
    }
    public static int rec(Set<Integer>set,int i,int count ){
        while(set.contains(i+1)){i++;count++;}
        return count;
    }
}