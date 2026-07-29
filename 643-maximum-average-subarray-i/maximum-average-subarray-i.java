class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int low =0, high = k-1;
        int sum =0;
        for(int i=low; i<=high;i++){
            sum = sum + nums[i];
        
        }
         int res =sum;
        while(high<n){
            res = Math.max(res,sum);
            low++;
            high++;
            if(high == n ) break;
            sum = sum - nums[low-1];
            sum = sum + nums[high];
        }

        return (double) res/k;
        
        
    }
}