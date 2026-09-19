class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int value : arr){
            map.put(value,map.getOrDefault(value,0)+1);
         }
    

         HashSet<Integer> set = new HashSet<>();
         for(int freq : map.values()){
            if(set.contains(freq)){
                return false;
            } else {
                set.add(freq);
            }
         }
        return true;
    }
}