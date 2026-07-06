class Solution {
    public int findPeakElement(int[] a) {
        int n = a.length;
        int l=0,r=n-1;
        while(l<r)
        {
            int mid = l + (r-l)/2;
            if(a[mid]>a[mid+1])
            r = mid;
            else if(a[mid]<a[mid+1])
            l = mid+1;
        }
        return l;
    }
}