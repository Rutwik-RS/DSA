class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] gain = new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            gain[i] = gas[i]-cost[i];
            s+=gain[i];
        }
        if(s<0)
        return -1;
        else
        {
            int k=0;
            for(int i=0;i<n;i++)
            {
                if(gain[i]>=0)
                {
                    k=i;
                    break;
                }
            }
            int gcs = 0;
            int start = k; 

            for (int i = 0; i < n; i++) {
                gcs += gain[i];
                if (gcs < 0) {
                    gcs = 0;
                    start = i + 1; 
                }
            }
            return start;
        }
    }
}