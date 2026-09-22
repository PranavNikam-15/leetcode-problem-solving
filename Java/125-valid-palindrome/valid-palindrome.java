class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length()-1;

        for(int i=0, j=n; i<j; i++, j--) {

            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}