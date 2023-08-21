class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int l=1;l<=n/2;l++) {
            if(n%l==0) {
                StringBuilder pattern = new StringBuilder();
                int num=n/l;
                while(num>0){
                     
                    pattern.append(s.substring(0,l));
                    num--;
                }
                if(s.equals(pattern.toString()))return true;
            }
        }
        return false;
    }
}