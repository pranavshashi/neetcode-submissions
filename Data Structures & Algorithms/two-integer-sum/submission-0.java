
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> nums_map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if (nums_map.containsKey(complement)){
                return new int[]{nums_map.get(complement),i};
            }
            nums_map.put(nums[i], i);
        }
        return new int[] {};
    }
}
