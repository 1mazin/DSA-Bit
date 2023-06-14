class Solution {
    public int equalPairs(int[][] grid) {
        int ans=0;
       HashMap<String,Integer> m=new HashMap<>();
       for(int[] row :grid)
       {
           String curr=Arrays.toString(row);
           m.put(curr,m.getOrDefault(curr,0)+1);
       }
        for(int j=0;j<grid.length;j++)
        {
            int[] col=new int[grid.length];
            for(int i=0;i<col.length;i++)
            {
                col[i]=grid[i][j];
            }
            ans+=m.getOrDefault(Arrays.toString(col),0);
        }
        return ans;
    }
}