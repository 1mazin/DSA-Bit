class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length;
        if(k==n || k==1)
        {
            return 0;
        }
        int[] pairsum=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            pairsum[i]=weights[i]+weights[i+1];
        }
        Arrays.sort(pairsum);
        int i=0;int j=pairsum.length-1;
        
        long min=0;
        long max=0;
        while(k-1>0)
        {
            min+=pairsum[i++];
            max+=pairsum[j--];
            k--;
        }
        return (max-min);
        
        
    }
}