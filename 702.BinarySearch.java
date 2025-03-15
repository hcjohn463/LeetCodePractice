class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int middle = (left + right) >> 1;
            if(target < nums[right]){
                right--;
            }
            else if(target > nums[left]){
                left++;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}