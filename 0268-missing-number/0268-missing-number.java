class Solution {
    public int missingNumber(int[] a) {
        int n = a.length;
        int z=n;
        // Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            z+=(i-a[i]);
        }
        return z;
    }
}