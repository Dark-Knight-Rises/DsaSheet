/**
 * https://leetcode.com/problems/move-zeroes/
 * 
 * 283. Move Zeroes
 * Easy
 * 
 * 8520
 * 
 * 230
 * 
 * Add to List
 * 
 * Share
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 * 
 * Input: nums = [0]
 * Output: [0]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 * 
 * 
 * Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len == 0 || nums == null) {
            return;
        }
        int ptr = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ptr++;
            }
        }
        for (int x : nums) {
            System.out.println(x);
        }
    }
}
