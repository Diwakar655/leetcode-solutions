import java.util.HashMap;

class Solution {

    public int maxNumberOfBalloons(String text) {

        // Text ki frequency
        HashMap<Character, Integer> have = new HashMap<>();

        for (char c : text.toCharArray()) {
            have.put(c, have.getOrDefault(c, 0) + 1);
        }

        // "balloon" ki required frequency
        HashMap<Character, Integer> need = new HashMap<>();

        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);

        int ans = Integer.MAX_VALUE;

        // Need aur Have compare
        for (char c : need.keySet()) {

            int fneed = need.get(c);
            int fhave = have.getOrDefault(c, 0);

            int times = fhave / fneed;

            ans = Math.min(ans, times);
        }

        return ans;
    }
}