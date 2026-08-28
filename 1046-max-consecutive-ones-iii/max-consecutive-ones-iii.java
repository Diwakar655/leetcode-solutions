class Solution {
    public int longestOnes(int[] nums, int k) {
        int low =0 , high =0;
        int maxFreq =0 , res =0;

        int[] freq = new int[2];
        for( high = 0;high<nums.length;high++){
            freq[nums[high]]++;
            
            int len  = high-low+1;
            int diff = len - freq[1];

            while(diff>k){
                freq[nums[low]]--;
                low++;
                
               
                len  = high-low+1;
                diff = len - freq[1];
            }


            len  = high-low+1;
            res = Math.max(len ,res);
            

            
        }
        return res;
    }
}