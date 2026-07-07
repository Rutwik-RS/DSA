class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1,h=1,res=0;
        for(int i:nums)
        h = Math.max(h,i);
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(check(nums,mid,threshold))
            {
                res = mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return res;
    }
    public boolean check(int[] nums,int mid,int th)
    {
        int sum=0;
        for(int i:nums)
        {
            sum += (i + mid - 1) / mid;
        }
        if(sum <= th) return true;
        return false;
    }
}