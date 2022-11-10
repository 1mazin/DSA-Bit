class Solution {
    public void sol(int index,int k,int n,List<Integer> ds,List<List<Integer>> ans)
    {
        if(n==0 && k==0 )
        {
            ans.add(new ArrayList<>(ds));
        }
        for(int i=index;i<=9;i++)
        {
            if(i<=n)
            {
                ds.add(i);
                sol(i+1,k-1,n-i,ds,ans);
                ds.remove(ds.size()-1);
            }
            if(i>n)break;
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
         List<List<Integer>> ans=new ArrayList<>();
         sol(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
}