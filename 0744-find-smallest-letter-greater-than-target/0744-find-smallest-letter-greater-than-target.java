class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      
            int lo=0;
            int hi=letters.length-1;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(letters[mid]-target>0)
            {
                hi=mid-1;
            }
            else if(letters[mid]-target<=0)
            {
                lo=mid+1;
            }
        }
        return lo == letters.length ? letters[0] : letters[lo];
    }
}