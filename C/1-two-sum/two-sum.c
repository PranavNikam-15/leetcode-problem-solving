/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

// Hash Table with Chaining 

#define HASH_SIZE 10000

struct hash_node {
    int key;
    int index;
    struct hash_node *next;
};

static struct hash_node *hash_table[HASH_SIZE];

void hash_init(void) {
    for (int i = 0; i < HASH_SIZE; i++) {
        hash_table[i] = NULL;
    }
}

int hash_index(int num) {
    return ((num % HASH_SIZE) + HASH_SIZE) % HASH_SIZE;
}

void hash_insert(int key, int index) {
    int hash_idx = hash_index(key);

    struct hash_node *node = malloc(sizeof(struct hash_node));
    if (!node) return;

    node->key = key;
    node->index = index;
    node->next = hash_table[hash_idx];
    hash_table[hash_idx] = node;
}

int hash_find(int key) {
    int hash_idx = hash_index(key);
    struct hash_node *current = hash_table[hash_idx];

    while (current) {
        if (current->key == key){
            return current->index;
        }
        current = current->next;
    }
    return -1;
}

void hash_free(void) {
    for (int i = 0; i < HASH_SIZE; i++) {
        struct hash_node *current = hash_table[i];
        while (current) {
            struct hash_node *temp = current;
            current = current->next;
            free(temp);
        }
        hash_table[i] = NULL;
    }
}

int* twoSum(int *nums, int n, int target, int *returnSize) {
    hash_init();

    int *result_arr = malloc(2 * sizeof(int));
    if (result_arr == NULL || nums == NULL) {
        *returnSize = 0;
        return NULL;
    }

    for (int i = 0; i < n; i++) {
        int diff = target - nums[i];
        int index;

        if ((index = hash_find(diff)) != -1) {
            result_arr[0] = index;
            result_arr[1] = i;
            *returnSize = 2;
            hash_free();
            return result_arr;
        }
        hash_insert(nums[i], i);
    }

    *returnSize = 0;
    free(result_arr);
    hash_free();
    return NULL;
}




/*

// Hash Table using Array

#define HASH_SIZE 100000
static int hash_arr[HASH_SIZE];

void hash_init(){
    memset(hash_arr, -1, sizeof(hash_arr));
}

int hash_index(int key) {
    return ((key % HASH_SIZE) + HASH_SIZE) % HASH_SIZE;
}

int hash_insert(int num, int index){
    int idx = hash_index(num);
    if(hash_arr[idx] == -1){
        hash_arr[idx] = index;
        return 0;
    } else {
        return -1;
    }
}

int hash_find(int num){
    int idx = hash_index(num);
    if(hash_arr[idx] != -1){
        return hash_arr[idx];
    } else {
        return -1;
    }
}

int* twoSum(int* nums, int n, int target, int* returnSize) {

    int *result_arr = (int*)malloc(2*sizeof(int));
    int index;

    if(result_arr == NULL || nums == NULL || n < 2){
        *returnSize = 0;
        return NULL;
    }

    hash_init();
    
    for(int i=0; i<n; i++){
        int diff = target - nums[i];
        if(( index = hash_find(diff)) == -1){
            hash_insert(nums[i], i);
        } else {
            result_arr[0] = i;
            result_arr[1] = index;
            *returnSize = 2;
            return result_arr;
        }
    }

    *returnSize = 0;
    free(result_arr);
    return NULL;
}

*/




/*

// Brute Force Method :

int* twoSum(int* nums, int n, int target, int* returnSize) {
    int* result_arr = (int*)malloc(2 * sizeof(int));
    *returnSize = 2;

    if(result_arr == NULL || nums == NULL || n < 2){
        *returnSize = 0;
        return NULL;
    }
    
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (nums[i] + nums[j] == target) {
                result_arr[0] = i;
                result_arr[1] = j;
                return result_arr;
            }
        }
    }
    
    *returnSize = 0;
    return result_arr;
}

*/