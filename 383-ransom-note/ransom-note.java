class Solution {

    public boolean check(HashMap<Character, Integer> map1,
                         HashMap<Character, Integer> map2) {

        for (char c : map1.keySet()) {
            if (!map2.containsKey(c)) {
                 return false;
            }
            if (map2.get(c) < map1.get(c)) {
                return false;
            }   
        }

        return true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return check(map1, map2);
    }
}