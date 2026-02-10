// Binary Search Approach

int mySqrt(int x) {
    if(x < 2){
        return x;
    }

    int start = 1, end = x/2;
    int ans = 0;
    while(start <= end){
        long mid = start + (end - start)/2;
        if(mid*mid <= x){
            ans = mid;
            start = mid+1;
        } else {
            end = mid-1;
        }
    }
    return ans;
}


/*
    // Linear Method

    int mySqrt(int x) {
        if (x < 2){
            return x;
        } 

        int start = 1, end = x/2;
        int ans = 0;
        for(long i=start; i<=end; i++){
            if(i*i <= x){
                ans=i;
            } else {
                break;
            }
        }

        return ans;
    }

*/