class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=1; i < n; i++) {

            if(nums[i] == nums[i-1]) {
                return true;
            }
        }
        
        return false;
    }
}

/*
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            
            Set<Integer> arr = new HashSet<>();

            for(int n : nums) {
                if(!arr.add(n)) {
                    return true;
                }
            }

            return false;
        }
    }
*/ 