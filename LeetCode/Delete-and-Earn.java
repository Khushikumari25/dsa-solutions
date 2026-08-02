class Solution {
    int max ;
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        
        return solve(0 , nums);
        
    }
    public int solve(int i ,  int[] nums){
        if( i >= nums.length){
            return 0;
        }
        int j = i;
        int curr = nums[i];
        int earn = 0;

        while( j < nums.length && nums[j] == curr){
            earn += nums[j];
            j++;
            
        }

        int nottake = solve(j , nums);
        int k = j;
        while( k < nums.length && nums[k] == curr +1){
            k++;
        }
        int take =  earn + solve(k, nums);
            
        
        return  Math.max(take , nottake);
    }
}