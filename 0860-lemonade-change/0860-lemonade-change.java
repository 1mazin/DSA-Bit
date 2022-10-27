class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bank=0;
        int r5=0;
        int r10=0;
        int r20=0;
        if(bills[0]>5)return false;
        for(int i=0;i<bills.length;i++)
        {
            
            if(bills[i]==5 )r5++;
            else if(bills[i]==10 )
            {
                if(r5==0)return false;
                r5--;
                r10++;
                
            }
            else if(bills[i]==20)
            {
                if(r5>0 && r10>0)
                {
                    r10--;
                    r5--;
                }
                else if(r5>2)
                {
                    r5=r5-3;
                }
                else 
                {
                   return false;
                }
            }
            else 
            {
                return false;
            }
        }
        return true;
    }
}