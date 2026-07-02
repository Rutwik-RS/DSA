class Solution {
    public int singleNonDuplicate(int[] a) {
        int l=0,r=a.length-1;
        while(l<r)
        {
            int mid = l + (r-l)/2;
            if(mid%2==1)mid--;
            if(a[mid] == a[mid+1])
            l = mid+2;
            else
            r=mid;
        }
        return a[l];
    }
}