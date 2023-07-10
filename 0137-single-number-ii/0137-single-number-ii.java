class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<=nums.length)
        {
            if( i<=nums.length-2 && nums[i]==nums[i+2] )i+=2;
            else
            {
               return nums[i];
            }
            i++;
            System.out.println(i);
        }
        return -1;
        
    }
}