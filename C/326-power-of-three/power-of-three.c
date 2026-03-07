// largest power of 3 is 1162261467
// If n is a power of 3, it must divide 1162261467 perfectly
bool isPowerOfThree(int n) {
    return (n > 0) && (1162261467 % n == 0);
}



/*    
    bool isPowerOfThree(int n) {
        if(n <= 0) return false;
        while(n % 3 == 0) n = n/3;
        return (n == 1);
    }

*/