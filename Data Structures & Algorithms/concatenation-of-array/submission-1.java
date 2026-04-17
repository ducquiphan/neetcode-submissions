class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] resultsArr = new int[nums.length * 2];
        for (int i = 0; i < resultsArr.length; i++){
            if (i <= nums.length - 1){
                resultsArr[i] = nums[i];
            }else{
                resultsArr[i] = nums[i-nums.length];
            }
        }
        return resultsArr;
    }
}