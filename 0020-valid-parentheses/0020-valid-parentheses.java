class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack = new Stack<>();
    
    for(int n=0;n<s.length();n++){            
        char ch = s.charAt(n);
        if(ch=='(' || ch=='{' || ch=='[') stack.push(ch);
        else if(stack.empty()) return false;
        else{
            if((ch=='}' && stack.peek()=='{') || (ch==')' && stack.peek()=='(') || (ch==']' && stack.peek()=='[')) stack.pop();
            else stack.push(ch);
        }
    }
     
    return stack.empty();
}
}