class Solution {
     public int search(int[] nums, int target) {
        return Find(nums, 0, nums.length - 1, target);
    }

    private int Find(int[] nums, int start, int end, int target) {
        if(end < start) return -1;
        if(start == end) {
            return nums[start] == target ? start : -1;
        } else {
            int mid = (start + end) / 2;
            int first = Find(nums, start, mid, target);
            int second = Find(nums, mid + 1, end, target);
            int result = -1;
            if(first >= 0 && nums[first] == target) result = first;
            if(second >= 0 && nums[second] == target) result = second;
            return result;
        }
    }
}