class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        int min = Integer.MAX_VALUE;
        Arrays.fill(pref,Integer.MAX_VALUE);
        for(int i=0;i<n;i++)
        {
            min = Math.min(min,nums[i]);
            pref[i] = min;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= pref[i])
            {
                st.pop();
            }
            if(!st.isEmpty() && st.peek() < nums[i])
            return true;
            st.push(nums[i]);
        }
        return false;
    }
}