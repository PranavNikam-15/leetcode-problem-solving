class Solution {
    public void reverseString(char[] s) {
        
        int n = s.length;

        for(int i=0; i<n/2; i++) {
            
            int j = n-i-1;
            char ch = s[i];

            s[i] = s[j];
            s[j] = ch;
        }
    }
}