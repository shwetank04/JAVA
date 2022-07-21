Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

class Solution {
    public int maxProduct(int[] nums) {
        int ma = nums[0];
        int mi = nums[0];
        int prod = nums[0];
        int temp = 0;
        for(int i=1;i<nums.length;i++) { 
            if(nums[i] < 0) {
               temp = ma;
               ma = mi;
               mi = temp;
           }
           ma = Math.max(nums[i], ma * nums[i]);
           mi = Math.min(nums[i], mi * nums[i]);
           prod = Math.max(prod,ma); 
        }
        return prod;
    }
}
