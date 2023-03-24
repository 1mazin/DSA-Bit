class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int count=0;
        int indexOfZero=-1;
        boolean isZeroPresent=false;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                isZeroPresent=true;
                indexOfZero=i;
                count++;
            }
            else
            {
                prod*=nums[i];
            }
            
        }
        if(count>1)
        {
            return res;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(isZeroPresent)
            {
            if(count==1 && i==indexOfZero)
            {
                res[i]=prod;
            }
            else{
            res[i]=0;
            }
            }
            else
            {
                res[i]=prod/nums[i];
            }
        }
        return res;
        
     
    }
}