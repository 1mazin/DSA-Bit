class Solution {
    public void sol(int index,int target,int[] arr,List<Integer> ds,List<List<Integer>> ans)
    {
        if(target==0){ans.add(new ArrayList<>(ds));return;}
        for(int i=index;i<arr.length;i++)
        {
            if(arr[i]>target)
                break;
            else if(i>index && arr[i]==arr[i-1])continue;
            else 
            {
               ds.add(arr[i]);
               sol(i+1,target-arr[i],arr,ds,ans);
               ds.remove(ds.size()-1);
            }
                
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans =new ArrayList<>();
        sol(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
}