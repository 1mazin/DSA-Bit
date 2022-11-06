class Solution {
    public int myAtoi(String s) {
        
        if(s.length()==0){
            System.out.println("***");
            return 0;
        }
        int ans=0;
        int sign=1;
        int i=0;
        
        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
           if (i== s.length()) {
            return 0;
        }

        if (i<s.length() &&(s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-' ) {
                sign = -1;
               
            }
          i++;
        }
       
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {                                        
        
            char c=s.charAt(i);
            int curr=c-'0';
               if (ans > Integer.MAX_VALUE / 10 || (ans== Integer.MAX_VALUE / 10 && curr > Integer.MAX_VALUE % 10)) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
          
            ans=ans*10+curr;
         
            i++;
            
        }
        
        return sign*ans;
    }
    
    }