class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] solution = new int[2];

        // <Element, Index>
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                solution[0] = map.get(complement);
                solution[1] = i;
                return solution;
            }
            map.put(nums[i], i);
        }
        return solution;
    }
}