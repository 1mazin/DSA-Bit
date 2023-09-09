class Solution {
    int dp[][];
    int solve(int i,int[] nums,int target) {
        if(i<0 || i>=nums.length || target<0) {
            return 0;
        }
        if(dp[i][target]!=-1)return dp[i][target];
        if(target==0) {
            return dp[i][target]=1;
        }
    
        else 
        {
            return dp[i][target]=solve(0,nums,target-nums[i])+solve(i+1,nums,target);
        }
    }
    public int combinationSum4(int[] nums, int target) {
        dp=new int[201][1001];
        for(int i=0;i<201;i++){
            for(int j=0;j<1001;j++){
                dp[i][j]=-1;
            }
        }
        return solve(0,nums,target);
    }
}