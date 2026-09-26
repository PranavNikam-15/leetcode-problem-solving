class Solution {
    public int lengthOfLastWord(String s) {
        
        int i = s.length()-1;
        int length = 0;

        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}


/*

class Solution {
    public int lengthOfLastWord(String s) {
        
        String words[] = s.trim().split("\\s+");
        int lastIndex = words.length - 1;
        
        return words[lastIndex].length(); 
    }
}

*/