class Solution {
    public int removeElement(int[] arr, int val) {
        int slow = 0;
        for(int fast =0 ;fast<arr.length;fast++){
            if(arr[fast] != val){
                arr[slow] = arr[fast];
                slow++;
            }

        }
        return slow;
        
        
        
        
    }
}