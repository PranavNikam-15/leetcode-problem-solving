// optimized
int majorityElement(int* nums, int size) {
    int ele = nums[0];
    int count = 1;

    for(int i=1; i<size; i++){
        if(ele == nums[i]){
            count++;
        } else {
            count--;
        }

        if(count == 0){
            ele = nums[i];
            count = 1;
        }
    }
    return ele;
}



/*

int majorityElement(int* nums, int size) {
    for(int i=0; i<size; i++){
        int count = 0;
        
        for(int j=0; j<size; j++){
            if(nums[i] == nums[j]) count++;
        }

        if(count > size/2) return nums[i];
    }
    return -1;
}

*/