class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        HashMap<Integer,Boolean> m=new HashMap<>();
        for(int num:nums)
        {
            m.put(num,true);
        }
        for(int num:nums)
        {
            if(m.containsKey(num-1))
            {
                m.put(num,false);
            }
        }
        for(int num:m.keySet())
        {
           
            int curr=1;
            
            if(m.get(num)==true)
            {
                while(m.containsKey(num+curr))
                {
                    curr+=1;
                }
                if(curr>max)max=curr;
            }
        }
        return max;
    }
}