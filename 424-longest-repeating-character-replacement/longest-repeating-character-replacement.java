class Solution {
    public int characterReplacement(String s, int k) {
        int low =0, high = 0;
        int maxFreq =0, res =0;
        int[] freq = new int[26];

        for(high =0 ;high<s.length();high++){
            char ch = s.charAt(high);
            // current character ki frequency badhao
            freq[ch - 'A']++;

            // window me sabse zyada baar aane wala character
            maxFreq = Math.max(maxFreq, freq[ch-'A']);

            // kitne characters replace karne padenge
            int len = high-low+1;
            int diff= len -maxFreq;

            // agar k se zyada replacement chahiye

            while(diff >k){
                freq[s.charAt(low)-'A']--;
                low++;

                maxFreq = Math.max(maxFreq, freq[ch - 'A']);
                len = high-low+1;
                diff = len-maxFreq;

            }

            len = high-low+1;
            res = Math.max(res,len);
            
        }
        return res;
    }
}