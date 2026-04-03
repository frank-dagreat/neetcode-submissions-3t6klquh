/**
    Input: arrays of integers
    Action: check for duplicates in the input
    Output: return true or false if duplicates exist
    ---
    Brute force way - time: O(n^2), space: O(1)
        - Check every pair of elements (nested loop) if they are the same
            - If same, return true
            - If not same, move on to the next pair of indices
    Optimal way - time: O(n), space: O(n)
        - Leverage a HashSet to store the elements
        - If an element exists in the HashSet, return true
        - If element does not exist in HashSet, store the element
*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int number : nums) {
            if(set.contains(number)) {
                return true;
            }

            set.add(number);
        }

        return false;
    }
}