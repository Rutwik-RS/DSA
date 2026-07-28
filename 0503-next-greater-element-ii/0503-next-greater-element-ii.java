class Solution {
    public int[] nextGreaterElements(int[] a) {
        int n = a.length;
        int m = 2*a.length;
        int[] b = new int[m];
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> mp = new HashMap<>();
       for(int i=0;i<n;i++)
       {
        b[i]=a[i];
       }
       for(int i=n;i<m;i++)
       {
         b[i]=a[i-n];
       }

       for(int i=m-1;i>=0;i--)
       {
            while(!st.isEmpty() && b[i] >= st.peek() )
            {
                st.pop();
            }    
            if(i<n)
            {
                if(st.isEmpty())
                {
                    nge[i] = -1;
                }
                else
                {
                    nge[i] = st.peek();

                }
            }
            st.push(b[i]);
       }
       return nge;

    }
}