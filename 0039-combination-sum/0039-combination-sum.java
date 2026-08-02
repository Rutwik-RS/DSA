class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        int n = c.length;
        help(0,c,t,ans,0,n,ls);
        return ans;
    }
    public void help(int idx,int[] a, int t,List<List<Integer>> ans,int s,int n,List<Integer> ls)
    {
        
        if(idx == n)
        {
            return;
        }

            s+=a[idx];
            ls.add(a[idx]);
             if(s==t){
            ans.add(new ArrayList<>(ls));
            }
            if(s<t)
            help(idx,a,t,ans,s,n,ls);
            s-=a[idx];
            ls.remove(ls.size() - 1);
            help(idx+1,a,t,ans,s,n,ls);        
    return;
    }
}