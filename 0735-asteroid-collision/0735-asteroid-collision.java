class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    
        Stack<Integer> st=new Stack<>();
        for(int x:asteroids) {
            boolean flag=false;
            
           while(!st.isEmpty() && st.peek()>0 && x<0) {
               if(Math.abs(st.peek())==Math.abs(x)) {
                   flag=true;
                   st.pop();
                   break;
                   
               }
               else if(Math.abs(st.peek())>Math.abs(x))    {
                   flag=true;
                   break;
              
               }
               else {
                   st.pop();
                
               }
           }
        if(flag!=true)st.push(x);
               
        }
        int size=st.size();
        int ans[]=new int[size];
        for(int i=size-1;i>=0;i--) {
            ans[i]=st.peek();
            st.pop();
        }
        return ans;
            
    }
}