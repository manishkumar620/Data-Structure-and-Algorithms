class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int ans = target - nums[i];
            if(hs.containsKey(ans)){
             return new int[] {hs.get(ans),i};
            }

           hs.put(nums[i],i);
        }

        return new int[]{};
    }
}