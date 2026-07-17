class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int bal=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(bal>0)str.append(s.charAt(i));
                bal++;
                }
                else if(s.charAt(i)==')'){
                bal--;
                if(bal>0){
                str.append(s.charAt(i));
                }
                }
        }
        return str.toString();
    }
}