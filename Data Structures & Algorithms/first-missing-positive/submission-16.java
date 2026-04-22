class Solution {
    public int firstMissingPositive(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // int min = 1, max = 0;
        // for (int num : nums){
        //     map.putIfAbsent(num, 1);
        //     min = num >=1 ? Math.min(min, num) : min;
        //     max = Math.max(max, num);
        // }
        // if (max <= 0 || min != 1){
        //     return 1;
        // }
        // int smallestPosInt = 1;
        // while(smallestPosInt <= max){
        //     if (map.getOrDefault(smallestPosInt, 0) == 0){
        //         break;
        //     }
        //     smallestPosInt++;
        // }
        // return smallestPosInt;

        // int missing = 1;
        // while (true){
        //     boolean flag = true;
        //     for (int num : nums){
        //         if (missing == num){
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if (flag) return missing;
        //     missing++;
        // }

        // boolean[] seen = new boolean[nums.length];
        // for (int num : nums){
        //     if (num >= 1 && num <= nums.length){
        //         seen[num-1] = true;
        //     }
        // }
        // for (int i =0 ; i < seen.length; i++){
        //     if (seen[i] == false){
        //         return i+1;
        //     }
        // }
        // return nums.length+1;

        Arrays.sort(nums);
        int missing = 1;
        for (int num: nums){
            if (missing == num){
                missing++;
            }
        }
        return missing;

    }
}