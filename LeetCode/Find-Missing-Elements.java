class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums); 
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int curr = nums[i] + 1; curr < nums[i + 1]; curr++) {
                list.add(curr);
            }
        }
        
        return list;
    }
}