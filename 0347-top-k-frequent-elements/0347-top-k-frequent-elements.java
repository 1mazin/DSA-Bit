class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int num:nums)
        {
            m.put(num,m.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(m.get(a)-m.get(b)));
        
        for(int num:m.keySet())
        {
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        int[] res=new int[k];
        for(int i=0;i<res.length;i++)
        {
            res[res.length-i-1]=pq.poll();
        }
        
        return res;
        
        
    }                          
    
}