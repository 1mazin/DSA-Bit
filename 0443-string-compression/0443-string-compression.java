class Solution {

        
    public int compress(char[] chars) {
        int count=0;
        int val=0;
        
        
        for(int i=0;i<chars.length;i++)
        {
             val=1;
            while(i<chars.length-1 && chars[i]==chars[i+1])
            {
                i++;
                val++;
            }
            
            chars[count++]=chars[i];
            if(val==1)continue;
            String st=String.valueOf(val);
            for(int m=0;m<st.length();m++)
            {
                chars[count++]=st.charAt(m);
            }
        }
            
     return count;
    }
}