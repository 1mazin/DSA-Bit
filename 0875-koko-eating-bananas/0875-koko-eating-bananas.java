class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int result=-1;
        int hi=0;
        for(int pile :piles) {
            hi=Math.max(hi,pile);
        }
     
        while(lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(sol(piles,mid,h)) {
                result=mid;
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
        return result;
        
    }
    public boolean sol(int[] piles,int mid,int h) {
        int k=0;
        for(int i=0;i<piles.length;i++) {
            k+=Math.ceil((double)piles[i]/mid);
        }
        if(k<=h)return true;
        else return false;
    }
}