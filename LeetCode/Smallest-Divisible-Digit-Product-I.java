class Solution {
    public int smallestNumber(int n, int t) {
        if( n == t){
            return n;
        }
        if( t ==1 ){
            return n;
        } 
        if( n == 1){
            return t;
        }
    
            
        for(int i = n ; i <= 100 ; i++){
            String s = String.valueOf(i);
            if( s.length() == 1 ){
                for( int k = n ; k <= 9; k++){
                    if( k % t == 0){
                        return k;
                    }
                
                }
            }
        if(s.length() == 2){
             for(int j = 0 ; j < s.length(); j++){
                int mul = s.charAt(0) * s.charAt(1);
                if(mul % t == 0 ){
                    return Integer.parseInt(s);
                }
                break;
            }

        }
           
        
            
        }
        return -1;
        
    }
}