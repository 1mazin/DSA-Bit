class Solution {
    public long pow(long x,long y)
    {
   if (y == 0)
        return 1;
    long p = pow(x, y / 2);
    return p * p * (y % 2 > 0 ? x : 1) % 1000000007;
}  
    
    public int countGoodNumbers(long n) {
     return (int)((pow(5,(n+1)/2)*pow(4,n/2))%1000000007);
    }
}   