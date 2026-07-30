class Solution {
    public int findUnsortedSubarray(int[] a) {
        int left=-1,right=-1,n=a.length;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1]){
            left = i;break;}
            
        }
        if (left == -1) {
            return 0;
        }

        for(int i=n-1;i>0;i--)
        {
            if(a[i-1]>a[i]){
            right = i;break;}
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        while (left > 0 && a[left - 1] > min) {
            left--;
        }
        while (right < n - 1 && a[right + 1] < max) {
            right++;
        }
        // if(left > right ||(left ==0 && right==0))
        // return 0;
return right-left+1;
    }
}