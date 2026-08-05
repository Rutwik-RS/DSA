class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] a) {
        Map<Integer,List<Integer>> mp = new HashMap<>();
        for(int[] d : a){
            mp.putIfAbsent(d[0],new ArrayList<>());
            mp.get(d[0]).add(d[1]);
        }
        Set<Integer> st = new HashSet<>();
        bfs(k,mp,st);
        for(int i:mp.keySet())
        {
            if(!st.contains(i))
            {
                for(int target: mp.get(i))
                {
                    if(st.contains(target)) {
                        List<Integer> all = new ArrayList<>();
                        for(int j = 0; j < n; j++) all.add(j);
                        return all;
                    }
                }
            }
        }
        List<Integer> rem = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!st.contains(i)) {
                rem.add(i);
            }
        }
        return rem;

    }
    public void bfs(int k,Map<Integer,List<Integer>> mp,Set<Integer> sus)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        sus.add(k);
        while(!q.isEmpty())
        {
            int st =  q.poll();
            if(mp.containsKey(st))
            {
                for(int i:mp.get(st))
                {
                    if(!sus.contains(i))
                    {
                        sus.add(i);
                        q.add(i);
                    }
                }
            }
        }
    }
}