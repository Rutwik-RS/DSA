class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=1,h=0,res=0;
        for(int i:weights){
        l=Math.max(l,i);
        h+=i;}
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(check(weights,mid,days))
            {
                res=mid;
                h = mid-1;
            }
            else l=mid+1;
        }
        return res;
    }
    public boolean check(int[] a,int mid,int day)
    {
        int sum=0,cnt=1;
        for(int i=0;i<a.length;i++)
        {
            if(sum>mid || sum + a[i] >mid)
            {
                cnt++;
                sum=0;
            }
            sum += a[i];

        }
        if(cnt<=day) return true;
        return false;
    }
}