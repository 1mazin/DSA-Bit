class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<=31;i++)
        {
            int cntZero=0;
            int cntOne=0;
            int temp=(1<<i); //Mask to find the bit at kth position
            for(int num:nums)
            {
                int currbit=temp&num;
                if(currbit==0)cntZero++;
                else cntOne++;
            }
            if(cntZero%3==0)
            {
                res=(res)|(1<<i);
            }
        }
        return res;
        
    }
}