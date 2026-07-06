class Solution {
    public int minEatingSpeed(int[] a, int h) {
        int low=1;
        int hi=0;
        for(int i:a)
        hi = Math.max(hi,i);
        while(low<hi)
        {
            int mid = low + (hi-low)/2;
            long hrs=0;
            for(int ban:a)
            {
                hrs += (ban+mid-1)/mid;
            }

            if(hrs<=h)
            {
                hi=mid;
            }
            else
            low = mid+1;
        }
        return low;
    }
}