class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
       long answer=0;
       int min=-1;
        int max=-1;
        int leftbound=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<minK || nums[i]>maxK)
            {
                leftbound=i;
            }
            if(nums[i]==minK)
            {
                min=i;
            }
            if(nums[i]==maxK)
            {
                max=i;
            }
            answer+=Math.max(0,Math.min(min,max)-leftbound);
            
        }
        
        
        return answer;
    }
}