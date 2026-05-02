class Solution {
    public int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            } else {
                int currProfit = arr[i] - min;
                if(currProfit > profit){
                    profit = currProfit;
                }
            }
        }

        return profit;
    }
}