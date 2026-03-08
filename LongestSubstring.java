import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        // Map to store the last seen index of each character
        HashMap<Character, Integer> map = new HashMap<>();

        // 'left' and 'right' define the boundaries of our sliding window
        for (int right = 0, left = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            // If character was seen before AND is inside the current window
            if (map.containsKey(currentChar)) {
                // Move 'left' to the right of the previous occurrence
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Update the last seen position of the character
            map.put(currentChar, right);

            // Calculate window size and update max
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
