class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int c=0;
        int max=0;
        HashMap<Character,Integer> m=new HashMap<>(); 
        while(i<=j && j<s.length())
        {
            
            m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
            
            if(m.size()<j-i+1)
            {
                while(m.size()<(j-i+1))
                {
                    m.put(s.charAt(i),m.get(s.charAt(i))-1);
                    if(m.get(s.charAt(i))==0)
                    {
                        m.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            else if(m.size()==j-i+1)
            {
                max=Math.max(max,m.size());
                
            }
            j++;
               
        }
        return max;
        
    }
}