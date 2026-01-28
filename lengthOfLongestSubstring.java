class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256];
        
        // initialize array with -1
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        
        int left = 0;
        int maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            if (lastIndex[c] >= left) {
                left = lastIndex[c] + 1;
            }
            
            lastIndex[c] = right;
            
            int currLen = right - left + 1;
            if (currLen > maxLen) {
                maxLen = currLen;
            }
        }
        
        return maxLen;
    }
};
