class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = 1, max = 0;
        for (int num : nums){
            map.putIfAbsent(num, 1);
            min = num >=1 ? Math.min(min, num) : min;
            max = Math.max(max, num);
        }
        if (max <= 0 || min != 1){
            return 1;
        }
        int smallestPosInt = 1;
        while(smallestPosInt <= max){
            if (map.getOrDefault(smallestPosInt, 0) == 0){
                break;
            }
            smallestPosInt++;
        }
        return smallestPosInt;
    }
}