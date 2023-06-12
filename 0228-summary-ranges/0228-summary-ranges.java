class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans =new ArrayList<>();
        for(int i=0;i<nums.length;i++)

        {
            int first=nums[i];
            while(i+1<nums.length&& nums[i]+1==nums[i+1])
            {
                i++;
            }
            if(first!=nums[i])
            {
            ans.add(first+"->"+nums[i]);
                }
            else
            {
                ans.add(String.valueOf(first));
            }
        }
        return ans;
    }
}