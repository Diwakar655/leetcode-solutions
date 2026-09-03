class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length() - 1;
        int low = 0, high = k - 1;
        int count = 0;
        int res = 0;

        // First window
        for (int i = 0; i <= high; i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // First window ka answer
        res = count;

        while (high < n) {

            // Remove left character
            char leftch = s.charAt(low);
            low++;

            if (leftch == 'a' || leftch == 'e' || leftch == 'i' ||
                leftch == 'o' || leftch == 'u') {
                count--;
            }

            // Add right character
            high++;
            char rightch = s.charAt(high);

            if (rightch == 'a' || rightch == 'e' || rightch == 'i' ||
                rightch == 'o' || rightch == 'u') {
                count++;
            }

            // Update answer
            res = Math.max(res, count);
        }

        return res;
    }
}