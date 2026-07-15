class Solution {
    public int gcdOfOddEvenSums(int n) {
        int so=0,se=0;
        List<Integer> ls  =new ArrayList<>();
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        for(int i=1;i<=(n*2);i++)
            {
                if(i%2==0)
                    se+=i;
                else
                    so+=i;
            }
        for(int i=2;i<=se;i++)
            {
                if(se%i==0 && so%i==0)
                {
                    ls.add(i);
                }
            }
        Collections.sort(ls);
        int z = ls.get(ls.size()-1);
        return z;
    }
}