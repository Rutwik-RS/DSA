class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int opt1 = nums[n-1]*nums[n-2]*nums[n-3];
        int opt2 = nums[n-1]*nums[1]*nums[0];
        return Math.max(opt1,opt2);
    }
}