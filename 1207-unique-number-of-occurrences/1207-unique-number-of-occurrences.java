class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
          HashSet<Integer> hset=new HashSet<>(m.values());
        return hset.size()==m.size();
    
    }
}