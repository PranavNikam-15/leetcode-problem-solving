class Solution {
    public String reverseWords(String s) {
        
       StringBuilder result = new StringBuilder();
       int i = s.length() - 1;

       while(i >= 0) {

            // skip the spaces
            while(i >= 0  && s.charAt(i) == ' ') {
                i--;
            }

            if(i < 0) {
                break;
            }

            // find the beginning of the word
            int j = i;

            while(j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // Add space between words
            if(result.length() > 0) {
                result.append(' ');
            }

            // Append current word
            result.append(s, j+1, i+1);
            i = j;
        }
        return result.toString();
    }
}


/*

class Solution {
    public String reverseWords(String s) {
        
        String words[] = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i=words.length-1; i>=0; i--) {
            result.append(words[i]);

            if(i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

*/