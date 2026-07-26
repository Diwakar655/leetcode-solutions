class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n =arr.length;
        int low =0, high =0,sum =0;
        int res = Integer.MAX_VALUE;
        while(high<n){
            sum = sum+arr[high];
            while(sum>=target){
                int len = high-low+1;
                res = Math.min(res,len);
                sum = sum-arr[low];
                low++;
            }
            high++;
        }
        if (res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;

    }
}