int lengthOfLongestSubstring(char* s) {
    int n = strlen(s);
    int maxLen = 0;
    int left = 0;

    int hash[256];
    memset(hash, -1, sizeof(hash));

    for(int right=0; right < n; right++)
    {
        if(hash[s[right]] != -1 && hash[s[right]] >= left){
            left = hash[s[right]] + 1;
        } 

        int currLen = right - left + 1;
        maxLen = (currLen > maxLen) ? currLen : maxLen;
        
        hash[s[right]] = right;
    }    
    return maxLen;
}


/*
    // Brute Force Method
    
    int lengthOfLongestSubstring(char* s) {
        int n = strlen(s);
        int maxLen = 0;

        for(int i=0; i<n; i++){
            int hash[256];
            memset(hash, -1, sizeof(hash));

            for(int j=i; j<n; j++){
                if(hash[s[j]] == 1){
                    break;
                }
                int currLen = j - i + 1;
                maxLen = (currLen > maxLen) ? currLen : maxLen;
                hash[s[j]] = 1;
            }
        }
        return maxLen;
    }
*/