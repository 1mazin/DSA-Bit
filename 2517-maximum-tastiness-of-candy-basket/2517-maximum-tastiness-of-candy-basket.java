class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int min=0;
        int ans=0;
        int max=price[price.length-1]-price[0];
        
        
        while(min<=max)
        {
            int mid=(max-min)/2+min;
            if(helper(mid,price,k))
            {
                ans=mid;
                min=mid+1;
                
            }
            else{
                max=mid-1;
            }
        }
        return ans;
    }
    public boolean helper(int diff,int[] price,int k)
    {
        int j=0;
        int len=1;
        
        for(int i=1;i<price.length;i++)
        {
            if(Math.abs(price[i]-price[j])>=diff)
            {
                len++;
                j=i;
            }
        }
        if(len>=k)
        {
            return true;
        }
        return false;
    }
}