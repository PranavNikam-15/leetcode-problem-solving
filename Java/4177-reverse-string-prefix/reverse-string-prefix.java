class Solution {
    public String reversePrefix(String s, int k) {
        
        StringBuilder result = new StringBuilder();
        int i = k-1;

        while(i >= 0) {

            result.append(s.charAt(i));
            i--;
        }

        result.append(s.substring(k, s.length()));

        return result.toString();
    }
}