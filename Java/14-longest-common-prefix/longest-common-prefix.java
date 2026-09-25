class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];
        int n = strs.length;

        for(int i=1; i<n; i++) {

            while(!strs[i].startsWith(prefix)) {

                int length = prefix.length();
                prefix = prefix.substring(0, length-1);

                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}