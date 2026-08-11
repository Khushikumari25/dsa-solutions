class Solution {
    public int missingInteger(int[] arr) {
        int n = arr.length;
        int sum = arr[0];

        for(int i = 0; i < n-1 ; i++){
            if(arr[i+1] - arr[i] == 1){
                sum += arr[i+1];
                
            }else{
                break;
            }
            
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < n ; i++){

            if( arr[i] == sum){
               sum++;
            }
        }
        return sum;

        
    }
}