class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            // skip duplicate
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            int s = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == s) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // skip duplicates
                    while (left < n && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (right>=0 && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < s) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}