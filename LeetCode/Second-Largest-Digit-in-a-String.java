class Solution {
    public int secondHighest(String s) {
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char ch : arr){
            if( ch >= '0' && ch <= '9'){
                sb.append(ch);

            }

        }
        
       String t = sb.toString();

       char nums[] = t.toCharArray();
       Arrays.sort(nums);
       if(arr[0] != arr[1]){
        return arr[0];
       }
       return -1;
    }
}