class Solution {
    public boolean isVowel(char s)
    {
        if(s=='i'||s=='e'||s=='o'||s=='u'||s=='a'||s=='I'||s=='E'||s=='O'||s=='U'||s=='A')
            return true;
        else return false;
    }
    public static String toString(char[] a)
    {
        // Creating an object of String class
        String string = String.valueOf(a);
 
        return string;
    }
    public void swap(char[] str,int i,int j)
    {
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }
    public String reverseVowels(String s) {
        
        int i=0;
        int j=s.length()-1;
        char[] str = s.toCharArray();
        while(i<=j)
        {
            if(isVowel(str[i])&& isVowel(str[j]))
               {
                   swap(str,i,j);
                   i++;
                   j--;
               }
            else if(!isVowel(str[i]))i++;
               else j--;
        }
               return toString(str);
    }
}