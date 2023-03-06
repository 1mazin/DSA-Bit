class Solution {
    public int numberOfSubarrays(int[] nums, int k1) {
        int ans=0;
        int sum=0;
        int res=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]%2==0)
           {
               nums[i]=0;
           }
           else
           {
               nums[i]=1;
           }
        }
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            m.put(sum,m.getOrDefault(sum,0)+1);
            if(m.containsKey(sum-k1))
            {
                res+=m.get(sum-k1);
            }
        }
        return res;
        
    }
}