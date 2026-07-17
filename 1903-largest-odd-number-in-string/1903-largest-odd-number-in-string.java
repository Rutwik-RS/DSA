class Solution {
    public String largestOddNumber(String s) {
        int j = s.length()-1;
        while(j>=0)
        {
            int jnum = s.charAt(j) - '0' ;
            if( jnum % 2 ==1 ){
            return s.substring(0,j+1);}
            else j--;
        }
        return "";
    }
}