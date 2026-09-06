class Solution {
    public int[] sortArrayByParity(int[] arr) {
       int left =0 , right = arr.length-1;
       while(left<right){
        if(arr[left] %2 != 0 && arr[right] % 2 ==0 ){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--; 
            
        }else if( arr[left] % 2 ==0){
            left++;
        }else{
            right--;
        }
       }
       return arr;
    }
}