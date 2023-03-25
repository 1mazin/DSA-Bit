class Solution {
    public long[] sumOfThree(long sum){
       HashSet<Integer> s=new HashSet<>();
       long ans[]=new long[3];
       long num=sum/3;
       if(((num)+(num+1)+(num+2))==sum)
       {
           ans[0]=num+1;
           ans[1]=num+2;
           ans[2]=num+3;
       }
       else if((((num)+(num-1)+(num-2))==sum) )
       {
           ans[0]=num-2;
           ans[1]=num-1;
           ans[2]=num;
       }
        else if((((num)+(num-1)+(num+1))==sum) )
       {
           ans[0]=num-1;
           ans[1]=num;
           ans[2]=num+1;
       }
        else
        {
            return new long[]{};
        }
        return ans;
    }
}