class Solution {
    public int minAddToMakeValid(String A) {
        int openingBraces=0,closingBraces=0;
    for(int i=0;i<A.length();i++){
        if(A.charAt(i)=='(')

            openingBraces++;
        else if( openingBraces > 0)

            openingBraces--;
        else closingBraces++;
    }
    return Math.abs(openingBraces+closingBraces);
    }
}