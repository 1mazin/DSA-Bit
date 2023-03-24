class Solution {
    public int longestConsecutive(int[] nums) {
         if (nums.length == 0 || nums.length==1 ) {
            return nums.length;
        }

        Arrays.sort(nums);
        int count=1;
        int max=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>0;i--)
        {
            if (nums[i] != nums[i-1]){
            if(nums[i]==nums[i-1]+1 )
            {
                
                count++;
               
            }
            else
            {
                count=1;
            }
             if(count>max)max=count;
            }
            
        }
        if(max<0)max=1;
        return max;
    }
}