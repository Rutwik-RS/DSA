import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2!=0)
        return false;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            st.push(s.charAt(i));
            else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char ch = s.charAt(i);
                char top = st.peek();
                if((ch == ')' && top !='(')||(ch == '}' && top !='{')||(ch == ']' && top !='['))
                {
                    return false;
                }
                else
                st.pop();
            }
            
        }
        if(st.isEmpty())
            return true;
             return false;
    }
}
