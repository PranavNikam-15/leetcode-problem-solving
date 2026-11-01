class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxCount = 0;
        int curCount = 0;

        for(int i=0; i< nums.length; i++) {

            if(nums[i] == 1) {  
                curCount++;
            } else {
                maxCount = (maxCount > curCount) 
                ? maxCount 
                : curCount;

                curCount = 0;
            }
        }

        return maxCount = (maxCount > curCount) 
            ? maxCount 
            : curCount;
    }
}