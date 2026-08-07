class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int arr[] = new int[k];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < n-k +1; i++){
            //arr[i] = nums[i];
            for( int j = 0; j < k ; j++){
                arr[j] = nums[i+j];

            }
            Arrays.sort(arr);
            if( arr[x-1] > 0){
                list.add(0);
            }else{
                list.add(arr[x-1]);

            }
            

        }
        int arr1[] = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            arr1[i] = list.get(i);
        } 
        return arr1;
        
        
    }
}