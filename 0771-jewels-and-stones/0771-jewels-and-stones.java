class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     int  count=0;
     int i=0;
     int j=0;
     while(j<jewels.length() && i<stones.length())
     {
        if(stones.charAt(i)==jewels.charAt(j))
        {
            count++;
            
        }
         i++;
        if(i==stones.length())
        {
            j++;
            i=0;
            
        }
       
        
        
     }
     return count;
    }
}