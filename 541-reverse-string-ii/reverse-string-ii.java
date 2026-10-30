class Solution {
    public String reverseStr(String s, int k) {
        int step = 2*k;
        char[] ans = s.toCharArray();
        for(int i =0;i<ans.length;i+=step){
            int start = i;
            int end = Math.min(i+k-1,ans.length-1);
            while(start<end){
                char temp = ans[start];
                ans[start] = ans[end];
                ans[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ans);
        
    }
}