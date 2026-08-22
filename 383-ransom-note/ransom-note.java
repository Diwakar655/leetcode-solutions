import java.util.HashMap;

class Solution {

    public boolean check(HashMap<Character, Integer> need,
                         HashMap<Character, Integer> have) {

        for (char c : need.keySet()) {

            int fneed = need.get(c);
            int fhave = have.getOrDefault(c, 0);

            if (fhave < fneed) {
                return false;
            }
        }

        return true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();

        // Ransom note ki frequency
        for (char c : ransomNote.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // Magazine ki frequency
        for (char c : magazine.toCharArray()) {
            have.put(c, have.getOrDefault(c, 0) + 1);
        }

        return check(need, have);
    }
}