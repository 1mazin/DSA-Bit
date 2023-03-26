class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int max=Integer.MIN_VALUE;
        int j=height.length-1;
        while(i!=j)
        {
            int curr=Math.min(height[i],height[j])*(j-i);
            if(height[i]<height[j])i++;
            else j--;
        max=Math.max(curr,max);
        }
        return max;
    }
    
    
}