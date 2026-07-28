class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] nge = new int[n];
        Map<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=m-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums2[i]>=st.peek())
            {
                st.pop();
            }
            if(!st.isEmpty()){
                mp.put(nums2[i],st.peek());
            }
            else
            {
                mp.put(nums2[i],-1);
            }
                st.push(nums2[i]);   
        }
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(nums1[i]))
            {
                nge[i] = mp.get(nums1[i]);
            }
        }
        return nge;
    }
}