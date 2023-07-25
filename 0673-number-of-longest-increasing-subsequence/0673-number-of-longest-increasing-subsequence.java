class Solution {
    public int findNumberOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        int cnt[]=new int[nums.length];
        for(int i=0;i<dp.length;i++) {
            dp[i]=1;
            cnt[i]=1;
        }
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<i;j++) {
                if(nums[i]>nums[j]) {
                    if(dp[i]==1+dp[j])
                        cnt[i]+=cnt[j];
                    else if(dp[i]<dp[j]+1) {
                        cnt[i]=cnt[j];
                        dp[i]=dp[j]+1;
                    }
    
                }
           
            }
                 max=Math.max(dp[i],max);
        }
        for(int i=0;i<cnt.length;i++) {
     
            if(dp[i]==max) ans+=cnt[i];

        }
        return ans;
    }
}