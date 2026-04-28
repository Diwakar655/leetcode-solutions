class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
         ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n= arr[0].length;
        int firstRow =0,lastRow = m-1, firstColumn = 0, lastColumn = n-1;
        while(firstRow<= lastRow && firstColumn <= lastColumn){
            // right
            for(int j = firstColumn; j<=lastColumn;j++){
                ans.add(arr[firstRow][j]);

            }
            firstRow++;
            if(firstRow>lastRow || firstColumn > lastColumn) break;
            // down
            for(int i = firstRow; i<=lastRow;i++){
                ans.add(arr[i][lastColumn]);

            }
            lastColumn--;
            if(firstRow>lastRow || firstColumn > lastColumn) break;

            // left
            for(int j = lastColumn; j>=firstColumn;j--){
                ans.add(arr[lastRow][j]);

            }
            lastRow--;
            if(firstRow>lastRow || firstColumn > lastColumn) break;
            // Up
            for(int i = lastRow; i>=firstRow;i--){
                ans.add(arr[i][firstColumn]);

            }
            firstColumn++;


        }
        return ans;

        
    }
}