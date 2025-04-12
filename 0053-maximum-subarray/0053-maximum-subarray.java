class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_for;
        int cur_max;

        max_so_for=nums[0];
        cur_max=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            cur_max=Math.max(nums[i],nums[i]+cur_max);
            max_so_for=Math.max(cur_max,max_so_for);
        }
        return max_so_for;
    }
}