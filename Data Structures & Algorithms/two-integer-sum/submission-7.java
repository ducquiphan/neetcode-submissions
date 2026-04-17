class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i ++){
        //     for (int j = 0; j < nums.length; j++){
        //         if (i!=j && nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{0,0};
        Map<Integer, Integer> compliment = new HashMap<>();

        for (int i =0; i < nums.length; i ++){
            int difference = target - nums[i];
            if (compliment.containsKey(difference)){
                return new int[]{compliment.get(difference), i};
            }
            compliment.put(nums[i], i);
        }
        return new int[]{};
    }
}
