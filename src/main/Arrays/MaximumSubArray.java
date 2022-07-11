Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
  

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        if(nums.length == 1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){             
            sum += nums[i];
            if(sum<nums[i]){
              sum = nums[i];
            }
            if(sum > max){
                max = sum;
                }
            }
        return max;
        }
    }
