class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid[0].length;
        int ans=0;
        for(int[] row:grid)
        {
            int lo=0;
            int hi=n-1;
            while(lo<=hi)
            {
                int mid=lo+(hi-lo)/2;
                if(row[mid]<0){
                    hi=mid-1;
                }
                else
                {
                    lo=mid+1;
                }
            }
            ans+=(n-lo);
        }
        return ans;
       
    }
}