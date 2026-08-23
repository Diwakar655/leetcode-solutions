class Solution {
    public int removeDuplicates(int[] arr) {
      int i =0 ,j=i+1;
      int res =1;
      while(j<arr.length){
        if(arr[j-1] == arr[j]){
            j++;
        }else{
            arr[i+1] = arr[j];
            res+=1;
            i++;
            j++;
        }
      }
      return res;


       
        
    }
}