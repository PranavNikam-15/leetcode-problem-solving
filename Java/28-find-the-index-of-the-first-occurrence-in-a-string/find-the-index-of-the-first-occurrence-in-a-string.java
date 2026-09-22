class Solution {
    public int strStr(String haystack, String needle) {
        
        int n = haystack.length() - needle.length();

        for(int i=0; i<=n; i++) {
            
            int j=0;
            while(j<needle.length() && 
                  needle.charAt(j) == haystack.charAt(i+j)) {
                j++;
            }

            if(j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}


/*
    class Solution {
        public int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
        }
    }    
*/