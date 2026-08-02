class Solution {
    public boolean canJump(int[] a) {
        int idx=0,n=a.length;
        for(int i=0;i<n;i++)
        {
            if(i>idx) return false;
            idx = Math.max(idx,i + a[i]);
            if(idx >= n-1) return true;
            
        }
        return false;

    }
}