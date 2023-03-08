class Solution {
    public boolean check(int mid,int[] piles,int h)
    {
        long hour=0;
        for(int pile:piles)
        {
            hour+=(int)Math.ceil((double)pile/(double)mid);

        }
        if(hour>h)return false;
        else return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(max,piles[i]);
        }
        int lo=1;
        int hi=max;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(check(mid,piles,h))
            hi=mid-1;
            else 
            {
                lo=mid+1;
            }
        }
        return lo;
        
    }
}