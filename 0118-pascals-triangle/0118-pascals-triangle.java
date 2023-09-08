class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> a1=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> a2=new ArrayList<>();
            for(int j=0;j<=i;j++)a2.add(1);
            if(i>=2){
                List temp=a1.get(i-1);
                int sum=0,l=0,k1=1;
                for(int k=0;k<temp.size();k++){
                    l++;
                    sum+=(int)temp.get(k);
                    if(l%2==0 && l!=0){
                        a2.set(k1,sum);
                        sum=0;k1++;k--;l=0;
                    } 
                }
            }
            a1.add(a2);
        }
        return a1;
    }
}
