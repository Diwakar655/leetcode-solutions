
class Solution {
    public String reverseWords(String s) {
        char[] ans = s.toCharArray();
        int j = 0;

        for (int i = 0; i <= ans.length; i++) {
            if (i == ans.length || ans[i] == ' ') {
                int left = j;
                int right = i - 1;

                while (left < right) {
                    char temp = ans[left];
                    ans[left] = ans[right];
                    ans[right] = temp;

                    left++;
                    right--;
                }

                j = i + 1;
            }
        }

        return new String(ans);
    }
}
