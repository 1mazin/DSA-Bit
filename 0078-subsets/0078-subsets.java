class Solution {
    public List<List<Integer>> subsets(int[] nums){
        int n=nums.length;
        List<List<Integer>> ans =new ArrayList<>();
      for(int i =0;i<Math.pow(2,n);i++)
      {
          List<Integer> a=new ArrayList<>();
          for(int j=0;j<nums.length;j++)
          {
              if((i&(1<<j))!=0)
              {
                  a.add(nums[j]);
              }
                 
          }
          ans.add(a);
      }
        return ans;
        
        
    }
}