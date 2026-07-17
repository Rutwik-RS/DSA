class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int left = 0;
        int right = m - 1;

        while(left <= right)
        {
            int mid = left + (right - left)/2;
            int maxRow =0;
            for(int i=0;i<n;i++)
            {
                if(mat[i][mid] > mat[maxRow][mid])
                {
                    maxRow  = i;
                }
            }
        int leftVal = (mid > 0) ? mat[maxRow][mid - 1] : -1;
        int rightVal = (mid < m - 1) ? mat[maxRow][mid + 1] : -1;

        if(mat[maxRow][mid] > leftVal && mat[maxRow][mid]>rightVal)
        {
            return new int[]{maxRow,mid};
        }
        if (leftVal > mat[maxRow][mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
        }

        }
        return new int[]{-1,-1};

    }
}