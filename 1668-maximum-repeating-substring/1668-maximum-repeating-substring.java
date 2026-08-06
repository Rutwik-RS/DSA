class Solution {
    public int maxRepeating(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int cnt=0;

        while(true)
        {
            // String s = 
            if(!s1.contains(s2.repeat(cnt)))
                return cnt-1;
            cnt++;
        }

    }
}