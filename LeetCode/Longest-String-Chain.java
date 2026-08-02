class Solution {
    public int longestStrChain(String[] words) {
        int max = 0;
        Arrays.sort(words , (a,b)-> a.length() - b.length());

        HashMap<String , Integer> map = new HashMap<>();

        for( String w : words){
            map.put(w ,1);
            int i = 0 ;

            while( i < w.length()){
                StringBuilder sb = new StringBuilder(w);
                String sub = sb.deleteCharAt(i).toString();

                if(map.containsKey(sub) && map.get(sub)+1 > map.get(w)){
                    map.put(w , map.get(sub)+1);
                }
                i++;
            }
            max = Math.max(max , map.get(w));
        }
        return max;

        
    }
}