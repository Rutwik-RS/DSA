class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max1=nums[n-1],max2=nums[n-2],min=nums[0];
        return (max1+max2)-min;
    }
}