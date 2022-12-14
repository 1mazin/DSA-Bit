class Solution {
    public void sol(int index,int[] arr,List<List<Integer>> ans,List<Integer> ds)
    {
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<arr.length;i++)
        {
            if(i>index && arr[i]==arr[i-1])
            {
                continue;
            }
            ds.add(arr[i]);
            sol(i+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
         List<List<Integer>> ans=new ArrayList<>();
         sol(0,nums,ans,new ArrayList<>());
        return ans;
    }   
}