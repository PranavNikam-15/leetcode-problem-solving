class Solution {
    public String reverseVowels(String s) {

        char[] str = s.toCharArray();

        int i = 0;
        int j = str.length - 1;

        while(i < j) {

            while(i < j && !isVowel(str[i])) {
                i++;
            }

            while(i < j && !isVowel(str[j])) {
                j--;
            }

            if(i < j) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;

                i++;
                j--;
            }
        }

        return new String(str);
    }

    public boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
            || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}