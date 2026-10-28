public class Solution {
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        for(String word : words) {

            result.append(new StringBuilder(word)
                .reverse()
                .append(" ")
            );
        }

        return result.toString().trim();
    }
}


/*

    class Solution {
        public String reverseWords(String s) {
            
            StringBuilder result = new StringBuilder();

            String[] words = s.split(" ");

            for(int i=0; i<words.length; i++) {

                int j = words[i].length() - 1;

                if(i != 0) {
                    result.append(' ');
                }

                while(j >= 0) {
                    
                    result.append(words[i].charAt(j));
                    j--;
                }
            }

            return result.toString();
        }
    }

*/