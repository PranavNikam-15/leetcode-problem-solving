class Solution {
    public String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();
        int i = 0;

        while(i < s.length()) {

            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32));
            } 
            else {
                result.append(ch);
            }

            i++;
        }

        return result.toString();
    }
}