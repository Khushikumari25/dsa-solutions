class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        // Key: "player_color" -> Value: frequency count
        HashMap<String, Integer> map = new HashMap<>();
        
        // Pick array par iterate karke frequency update karo
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];
            
            String key = player + "_" + color;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        int count = 0;
        
        // Har player for check karo ki kya uske paas required balls hain
        for (int i = 0; i < n; i++) {
            boolean isWinner = false;
            
            for (int color = 0; color <= 10; color++) {
                String key = i + "_" + color;
                
                // Player i ko winning ke liye (i + 1) balls chahiye
                if (map.getOrDefault(key, 0) >= i + 1) {
                    isWinner = true;
                    break; // Ek baar jeet gaya toh is player ke baki colors check karne ki zaroorat nahi
                }
            }
            
            if (isWinner) {
                count++;
            }
        }
        
        return count;
    }
}