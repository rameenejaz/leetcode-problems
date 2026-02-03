// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

class indexOfFirstSubstring {
public int strStr(String haystack, String needle) {
        int hl=haystack.length();
        int nl=needle.length();
        if (nl>hl) {
            return -1;
        }
        for (int i=0; i<=hl-nl ; i++) {
            int j=0;
            while (j<nl && haystack.charAt(i+j)==needle.charAt(j)) {
                j++;
            }
            if (j==nl) {
                return i;
            }
        }
        return -1;
    }
};
