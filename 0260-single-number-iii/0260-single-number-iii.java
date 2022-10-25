class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        int x=0;
        int y=0;
        for(int i :nums)
        {
            xor=xor^i;
        }
        int mask=xor&(-xor);
        for(int i :nums)
        {
            if((i& mask)==0)x=x^i;
            else y=y^i;
        }
        int[] ans=new int[2];
        ans[0]=x;
        ans[1]=y;
        return ans;
    }
}