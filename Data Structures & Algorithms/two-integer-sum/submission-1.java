/**
    Input: an integer array and target
    Action: checking which indices in array add up to the target 
    Output: return pair of int array
    ---
    Brute force way - time: O(n^2), space: O(1)
        - Check every pair of elements (nested loop) and add them
        - if they equal to target, return the pair of indices
        - if they do not equal to target, return empty array
    Optimal way - time: O(n), space: O(1)
        - Store each index and element as a Map
            - Key: element (Integer)
            - Value: index (Integer)
        - Subtract element from target to determine if it's in the map
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];

            if(map.containsKey(remainder)) {
                return new int[]{map.get(remainder), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
