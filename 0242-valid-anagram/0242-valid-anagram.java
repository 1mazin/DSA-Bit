class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
         char cnt[]=new char[26];
         for(int i=0;i<s.length();i++)
         {
             cnt[s.charAt(i)-'a']++;
             cnt[t.charAt(i)-'a']--;
         }
        for(int i=0;i<cnt.length;i++)
        {
            if(cnt[i]!=0)return false;
        }
        return true;
    }
}



 