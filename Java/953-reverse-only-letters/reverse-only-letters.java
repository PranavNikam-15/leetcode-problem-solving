class Solution {
    public String reverseOnlyLetters(String s) {

        char[] result = new char[s.length()];

        int i = 0;
        int j = s.length() - 1;

        while(i <= j) {

            while(i < j && !isAlphabet(s.charAt(i))) {
                result[i] = s.charAt(i);
                i++;
            }

            while(i < j && !isAlphabet(s.charAt(j))) {
                result[j] = s.charAt(j);
                j--;
            }

            if(i == j) {
                result[i] = s.charAt(i);
                break;
            }

            result[i] = s.charAt(j);
            result[j] = s.charAt(i);

            i++;
            j--;
        }

        return new String(result);
    }

    public boolean isAlphabet(char ch) {
        return (ch >= 'a' && ch <= 'z') ||
               (ch >= 'A' && ch <= 'Z');
    }
}