// optimized

int removeElement(int* nums, int n, int val) {
    int k = 0;
    while(k<n){
        if(nums[k] == val){
            nums[k] = nums[n-1];
            n--;
        } else {
            k++;
        }
    }
    return n;
}


/*
    // optimized

    int removeElement(int* nums, int n, int val) {
        int k=0;
        for(int i=0; i<n; i++) {
            if(nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
*/


/*
    // Brute Force Method

    int removeElement(int* nums, int n, int val) {
        int temp[n], k=0;

        for(int i=0; i<n; i++){
            if(nums[i] != val){
                temp[k++] = nums[i];
            }
        }

        for(int i=0; i<k; i++){
            nums[i] = temp[i];
        }

        return k;
    }
*/