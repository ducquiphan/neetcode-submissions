class Solution {
    public int trap(int[] height) {
        // if (height.length ==0 || height == null) return 0;
        // int n = height.length;
        // int res = 0;
        // for (int i = 0; i < n; i ++){
        //     int leftMax = height[i];
        //     int rightMax = height[i];

        //     for (int j = 0; j < i; j++){
        //         leftMax = Math.max(leftMax, height[j]);
        //     }
        //     for (int j = i+1; j < n ; j++){
        //         rightMax = Math.max(rightMax, height[j]);
        //     }
        //     res += Math.min(leftMax,rightMax) - height[i];
        // }
        // return res;

        if (height.length ==0 || height == null) return 0;
        int n = height.length;
        int res = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        for (int i = 1; i < n; i ++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        for (int i = n-2 ; i >=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        for (int i = 0; i < n ; i++){
            res += Math.min(leftMax[i],rightMax[i]) - height[i];
        }
        return res;

    }
}
