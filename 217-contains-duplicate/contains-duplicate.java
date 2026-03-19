class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean bool =false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                 bool =true;
            }
        }

        return bool;

        
    }
}