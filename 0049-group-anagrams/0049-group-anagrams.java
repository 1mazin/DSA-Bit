class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<String,List<String>> m =new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] str=strs[i].toCharArray();
            Arrays.sort(str);
            String curr=String.valueOf(str);
            if(!m.containsKey(curr))
            {
            m.put(curr,new ArrayList<>());
               
            }
             m.get(curr).add(strs[i]);
           
               
            
        }
        return new ArrayList(m.values());
        
  
}
}