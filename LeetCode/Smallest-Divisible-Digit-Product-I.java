class Solution {
    public int smallestNumber(int n, int t) {
        if (t == 1) return n;

        for (int i = n; i <= 100; i++) {
            String s = String.valueOf(i);
            if (s.length() == 1) {
                int digit = s.charAt(0) - '0'; 
                if (digit % t == 0) {
                    return i;
                }
            }
            
            else if (s.length() == 2) {
                int mul = (s.charAt(0) - '0') * (s.charAt(1) - '0');
                if (mul % t == 0) {
                    return i;
                }
            }
            else if (s.length() == 3) {
                int mul = (s.charAt(0) - '0') * (s.charAt(1) - '0') * (s.charAt(2) - '0');
                if (mul % t == 0) return i;
            }
        }
        return -1;
    }
}