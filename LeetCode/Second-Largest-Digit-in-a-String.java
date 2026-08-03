class Solution {
    public int secondHighest(String s) {
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char ch : arr){
            if( ch >= '0' && ch <= '9'){
                sb.append(ch);

            }

        }
        if (sb.length() == 0) return -1;
        
       String t = sb.toString();

       char nums[] = t.toCharArray();
       Arrays.sort(nums);

       int largest = nums[nums.length-1];

       for(int i = nums.length-1 ; i >= 0 ; i--){
            if(nums[i] != largest){
                return nums[i] -'0';
            }
       }
       return -1;
    }
}