int removeDuplicates(int* nums, int n) {
    if (n == 0) return 0;
    int k = 1;

    for (int i = 1; i < n; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
}

/*
    // Brute Force Method

    int removeDuplicates(int* nums, int n) {
        if (n == 0) return 0;

        int temp[n];
        int k = 0;

        temp[k++] = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                temp[k++] = nums[i];
            }
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return k;
    }

*/
