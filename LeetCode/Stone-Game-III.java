class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        
        // i+1, i+2, aur i+3 ke optimal answers store karne ke liye
        int next1 = 0, next2 = 0, next3 = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            int takeSum = 0;
            int maxScore = Integer.MIN_VALUE;
            
            //  1 stone pick karna
            takeSum += stoneValue[i];
            maxScore = Math.max(maxScore, takeSum - next1);
            
            //  2 stones pick karna (agar available hon)
            if (i + 1 < n) {
                takeSum += stoneValue[i + 1];
                maxScore = Math.max(maxScore, takeSum - next2);
            }
            
            // 3 stones pick karna (agar available hon)
            if (i + 2 < n) {
                takeSum += stoneValue[i + 2];
                maxScore = Math.max(maxScore, takeSum - next3);
            }
            
            // Variables ko next iteration ke liye shift kar do
            next3 = next2;
            next2 = next1;
            next1 = maxScore;
        }
        
        // next1 mein index 0 ka final result store hoga
        if (next1 > 0) return "Alice";
        if (next1 < 0) return "Bob";
        return "Tie";
    }
}