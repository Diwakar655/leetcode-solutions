class Solution {
    public int search(int[] nums, int target) {
        int low =0, high = nums.length-1;
        int result = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]>nums[nums.length-1]){
                low = mid+1;
            }else{
                result = mid;
                high = mid - 1;
            }
        }

        low = 0; 
         high = result-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                return mid;
            }
        }

         low = result ;
          high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                return mid;
            }
        }

        return -1;


        
        
    }
}