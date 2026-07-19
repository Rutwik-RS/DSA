class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
        mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);}
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(mp.entrySet());
        Collections.sort(list,(a,b)->b.getValue() - a.getValue());
        String res ="";
        for(Map.Entry<Character,Integer> entry : list)
        {
            char ch = entry.getKey();
            int freq = entry.getValue();
            while(freq-->0)
            {
                res+=ch;
            }
        }
        return res;
    }
}