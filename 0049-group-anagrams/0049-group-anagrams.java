class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m =new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String arr=strs[i];
            char[] s=strs[i].toCharArray();
            Arrays.sort(s);
            String a=new String(s);
            if(m.containsKey(a))
            {
                m.get(a).add(arr);
            }
            else
            {
                m.put(a,new ArrayList<>());
                m.get(a).add(arr);
            }
        }
        
        return new ArrayList<>(m.values());
}
}