class Solution {
    public long sumAndMultiply(int n) {
        String res = String.valueOf(n).replace("0","");
        long x=0;
        int t =n;
        while(t>0)
            {
                int dig = t%10;
                x+=dig;
                t/=10;
            }
       long z = res.isEmpty()? 0: Long.parseLong(res);
        return (long)(z*x);
    }
}