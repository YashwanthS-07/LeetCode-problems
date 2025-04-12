class Solution {
    public int singleNumber(int[] nums) {
        
      int single_value=nums[0];

      for(int i=1;i<nums.length;i++)
      {
        single_value=single_value ^ nums[i];
      }
      return single_value;
    }
}