class Solution {
    public int smallestNumber(int n, int t) {
        if( n == t){
            return n;
        }
            
        for(int i = n ; i <= 100 ; i++){
            String s = String.valueOf(i);
            if( s.length() == 1){
                return t;
            }
            for(int j = 0 ; j < s.length(); j++){
                int mul = s.charAt(0) * s.charAt(1);
                if(mul % t == 0 ){
                    return Integer.parseInt(s);
                }
                break;
            }
        
            
        }
        return -1;
        
    }
}