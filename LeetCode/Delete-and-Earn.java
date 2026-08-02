class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        Integer dp[] = new Integer[nums.length+1];
        
        return solve(0 , nums,dp);
        
    }
    public int solve(int i ,  int[] nums, Integer dp[]){
        if( i >= nums.length){
            return 0;
        }

        if(dp[i] != null){
            return dp[i];
        }
        int j = i;
        int curr = nums[i];
        int earn = 0;

        while( j < nums.length && nums[j] == curr){
            earn += nums[j];
            j++;
            
        }

        int nottake = solve(j , nums,dp);
        int k = j;
        while( k < nums.length && nums[k] == curr +1){
            k++;
        }
        int take =  earn + solve(k, nums,dp);
            
        
        return  dp[i] = Math.max(take , nottake);
    }
}