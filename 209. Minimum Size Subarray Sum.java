class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = nums.length + 1;
        int i = 0;
        int sum = 0;
        for(int j = 0 ;j < nums.length; j++){
            sum += nums[j];
            while(sum >= target){
                minLength = Math.min(j - i + 1, minLength);
                sum -= nums[i];
                i++;
            }
        }
        if(minLength == nums.length + 1){
            return 0;
        }
        return minLength;
    }
}