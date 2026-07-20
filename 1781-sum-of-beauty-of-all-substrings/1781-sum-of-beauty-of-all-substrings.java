class Solution {
    public int beautySum(String s) {
        int n = s.length(),total=0;
        for(int i=0;i<n;i++)
        {
            int[] freq = new int[26];
            for(int j=i;j<n;j++)
            {
                freq[s.charAt(j)-'a']++;
                total += getB(freq);
            }
        }
        return total;
    }
    public int getB(int[] f)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:f)
        {
            if(i>0){
            min=Math.min(min,i);
            max=Math.max(max,i);}
        }
        if(max-min!=0)
        return max-min;
        return 0;
    }
}