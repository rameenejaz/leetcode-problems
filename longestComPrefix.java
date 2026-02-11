class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];  // assume first string is prefix

        for (int i = 1; i < strs.length; i++) {
            int j = 0;

            // compare characters
            while (j < prefix.length() && 
                   j < strs[i].length() && 
                   prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            // shorten prefix
            prefix = prefix.substring(0, j);

            if (prefix.equals("")) {
                return "";
            }
        }

        return prefix;
    }
}
