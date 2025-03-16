class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int i = 0;
        int j = len - 1;
        int k = len - 1;
        while(k >= 0){
            int powI = nums[i] * nums[i];
            int powJ = nums[j] * nums[j];
            if(powI > powJ){
                result[k] = powI;
                i++;
            }
            else{
                result[k] = powJ;
                j--;
            }
            k--;
        }
        return result;
    }
}