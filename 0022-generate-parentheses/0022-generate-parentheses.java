class Solution {
    public void sol(List<String> res,int left,int right,String s,int n)
    {
        if(s.length()==n*2 )
            res.add(s);
         if(left<n)
             sol(res,left+1,right,s+"(",n);
         if(right<left)
             sol(res,left,right+1,s+')',n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        sol(ans,0,0,"",n);
        return ans;
        
    }
}