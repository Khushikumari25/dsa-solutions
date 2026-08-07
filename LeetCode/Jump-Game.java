class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean dp[] = new boolean[n];

        dp[0]= true;
        for(int i = 0 ; i < n ; i++){
            if(!dp[i])continue;
            int max = nums[i];
            for(int j = 1 ; j <= max ; j++){
                if( i+ j < n){
                    dp[i+j] = true;
                }
            }
             if(dp[n-1])return true;

        }
       

        return dp[n-1];
    }
    
}