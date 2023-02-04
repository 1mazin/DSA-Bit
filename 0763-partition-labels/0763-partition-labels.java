class Solution {
    public List<Integer> partitionLabels(String s) {
    int[] last=new int[26];
    List<Integer> ans=new ArrayList<>();
    //tracking the index of last occurence of characers present in the string
    for(int i=0;i<s.length();i++)
    {
        last[s.charAt(i)-'a']=i;
    }
    int currsize=0;
    int start=0;
    for(int i=0;i<s.length();i++)
    {
        currsize=Math.max(currsize,last[s.charAt(i)-'a']);
        if(i==currsize)
        {
            ans.add(currsize-start+1);
            start=i+1;
        }
    }
        return ans;
}
}