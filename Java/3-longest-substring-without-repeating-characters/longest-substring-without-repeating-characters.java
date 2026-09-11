class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int maxLen = 0;
        int left = 0;

        Map<Character, Integer> hash = new HashMap<>();

        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);

            if (hash.containsKey(ch) && hash.get(ch) >= left) {
                left = hash.get(ch) + 1;
            }

            int currLen = right - left + 1;
            maxLen = Math.max(maxLen, currLen);

            hash.put(ch, right);
        }
        return maxLen;
    }
}



/*

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int maxLen = 0;

        for (int i=0; i<n; i++) {

            Map<Character, Integer> hash = new HashMap<>();

            for (int j=i; j<n; j++) {
                char ch = s.charAt(j);

                if (hash.containsKey(ch)) {
                    break;
                }

                hash.put(ch, 1);

                int currLen = j-i+1;
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }
}

*/