/**
    Input: two strings
    Action: checking if each character in a one string is in the other 
    Output: return true or false based on the action
    ---
    Brute force way - time: O(n log n), space: O(1)
        - sort both strings
        - compare equality
    Optimal way - time: O(n), space: O(1)
        - Store each character in string in 2 Maps
            - Key: letter (Character)
            - Value: frequency (Integer)
        - Compare each character's frequency count
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>(); // r:2, a:2, c:2, e:1
        Map<Character, Integer> tMap = new HashMap<>(); // c:2, a:2, r:2, e:1

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i); // r,a,c,e,c,a,r
            char tChar = t.charAt(i); // c,a,r,r,a,c,e

            if(sMap.containsKey(sChar)) {
                sMap.put(sChar, sMap.get(sChar) + 1);
            } else {
                sMap.put(sChar, 1); 
            }

            if(tMap.containsKey(tChar)) {
                tMap.put(tChar, tMap.get(tChar) + 1);
            } else {
                tMap.put(tChar, 1); 
            }
        }

        return sMap.equals(tMap);

    }
}
