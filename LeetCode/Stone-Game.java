class Solution {
    public boolean stoneGame(int[] arr) {
        int max = 0;
        int n = arr.length;
        int alice1 = 0;
        int alice2 = 0;
        int bob = 0;
        for(int i = 0 ; i < n ; i+=2){
            alice1 += arr[i];
            alice2 += arr[n-1];
            max = Math.max(alice1 , alice2);
            bob = arr[i+1];
        }
        if(max > bob){
            return true ;
        }else{
            return false;
        }
        
    }
}