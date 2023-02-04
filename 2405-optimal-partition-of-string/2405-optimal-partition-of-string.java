class Solution {
    public int partitionString(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
           if(m.containsKey(s.charAt(i)))
           {
               ans++;
               m.clear();
               m.put(s.charAt(i),1);
           }
            else
            {
                m.put(s.charAt(i),1);
            }
        }
        return ans+1;
    }
}