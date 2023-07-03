class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())return false;
        
        int[] ch=new int[26];
        if(s.equals(goal))
        {
            for(int i=0;i<s.length();i++)
            {
                ch[s.charAt(i)-'a']++;
                if(ch[s.charAt(i)-'a']==2)return true;
            }
            return false;
        }
        else{
            
            int firstind=-1;
            int secondind=-1;
            for(int i=0;i<s.length();i++ )
            {
                if(s.charAt(i)!=goal.charAt(i))
                {
                    if(firstind==-1 )
                    {
                        firstind=i;
                    }
                    else if(secondind==-1)
                    {
                       secondind=i;
                   
                    }
                    else
                    {
                        return false;
                    }
                }
                    
            }
            
        if (secondind== -1 || firstind==-1) {
        
            return false;
        }
            
            return s.charAt(firstind) == goal.charAt(secondind) && 
               s.charAt(secondind) == goal.charAt(firstind);
        }
    }
}