class Solution {
    public void moveZeroes(int[] nums) {
    int zero = 0, l = 0, r = nums.length;
    while (l < r) {
        if (nums[l] != 0) {
            int tmp = nums[zero];
            nums[zero++] = nums[l];
            nums[l] = tmp;
        }
        l++;
    }
}
}