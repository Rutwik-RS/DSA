class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ls = new ArrayList<>();
        int max = nums[nums.length - 1], min = nums[0];
        for (int i = min; i <= max; i++) {
            ls.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (ls.contains(a))
                ls.remove(Integer.valueOf(a));
        }
        return ls;
    }
}