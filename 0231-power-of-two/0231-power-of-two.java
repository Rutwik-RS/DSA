class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
        if(n<=0) return false;
        while(n>0)
        {
            if((n&1)==1) c++;
            n>>=1;
        }
        if(c==1) return true;
        return false;
    }
}