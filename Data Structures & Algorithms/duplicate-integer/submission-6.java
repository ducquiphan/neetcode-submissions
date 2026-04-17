class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length-1; i++){
        //     if (nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            if(hm.containsKey(nums[i]) == false){
                hm.put(nums[i], 1);
            }else{
                return true;
            }
        }
        return false;
    }
}