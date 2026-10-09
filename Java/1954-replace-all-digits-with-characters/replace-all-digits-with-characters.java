class Solution {
    public String replaceDigits(String s) {

        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                sb.append(s.charAt(i));
            }
            else {
                char ch = (char)(s.charAt(i-1) + (s.charAt(i) - '0'));
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}