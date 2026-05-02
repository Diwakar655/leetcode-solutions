class Solution {
    public int maxProfit(int[] arr) {
       int n = arr.length;
       int maxProfit = 0;
       int buyPrice = arr[0];
       for(int i=0;i<n;i++){
        int currentProfit = arr[i] - buyPrice;
        if(currentProfit>maxProfit){
            maxProfit = currentProfit;
        }
        if(arr[i]<buyPrice){
            buyPrice = arr[i];
        }


       }
       return maxProfit;
    }
}