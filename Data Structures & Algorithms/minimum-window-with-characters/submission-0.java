class Solution {
     public boolean containsAll(Map<Character, Integer> windowFreq, Map<Character, Integer> targetFreq) {
        // Loop through target frequency map
        for (char c : targetFreq.keySet()) {
            // If any character frequency is less in the window, return false
            if (windowFreq.getOrDefault(c, 0) < targetFreq.get(c)) return false;
        }
        // Otherwise, the current window contains all required characters
        return true;
    }

    // Function to find minimum window substring
    public String minWindow(String s, String t) {
        // Frequency map to store characters of target string
        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }

        // Initialize minimum window length and result string
        int minLen = Integer.MAX_VALUE;
        String result = "";

        // Loop through all possible starting indices
        for (int i = 0; i < s.length(); i++) {
            // Frequency map for the current window
            Map<Character, Integer> windowFreq = new HashMap<>();

            // Loop through all possible ending indices starting from i
            for (int j = i; j < s.length(); j++) {
                // Add current character to window frequency
                char ch = s.charAt(j);
                windowFreq.put(ch, windowFreq.getOrDefault(ch, 0) + 1);

                // Check if current window contains all characters of target
                if (containsAll(windowFreq, targetFreq)) {
                    // If it's smaller than previously found, update result
                    if ((j - i + 1) < minLen) {
                        minLen = j - i + 1;
                        result = s.substring(i, j + 1);
                    }
                    break; // No need to extend this window further
                }
            }
        }

        return result;
    }
}