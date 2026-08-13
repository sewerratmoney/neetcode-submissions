class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (m.containsKey(comp)) {
                out[0] = m.get(comp);
                out[1] = i;
                break;
            }
            m.put(nums[i], i);
        }
        return out;
    }
}
