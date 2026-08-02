class Solution {
    public boolean isUgly(int n) {
        if( n == 1){
            return true;
        }
        if(2 * 3 == n || 3 * 5 == n || 2* 5 == n  ){
            return true;
        }else{
            return false;
        }
        
    }
}