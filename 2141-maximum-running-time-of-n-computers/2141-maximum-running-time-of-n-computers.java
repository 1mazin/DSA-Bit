class Solution {
    public long maxRunTime(int n, int[] batteries) {
        int[] largestN=new int[n];
        long sum=0;
        Arrays.sort(batteries);
        for(int i=0;i<batteries.length-n;i++) {
            sum+=batteries[i];
            
        }

        int[] live = Arrays.copyOfRange(batteries, batteries.length - n, batteries.length);
         if(sum==0)
         return live[0];
        int ans=live[0];
        for(int i=0;i<n-1;i++) {
            if(sum>=(long)(i+1)*(live[i+1]-live[i])) {
                sum-=(long)(i+1)*(live[i+1]-live[i]);
                ans=live[i+1];
                }
            else return live[i]+(sum/(long)(i+1));
        
        }
            return live[n - 1] + sum / n;
    }
}