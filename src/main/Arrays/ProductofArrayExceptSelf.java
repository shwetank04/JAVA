238. Product of Array Except Self
Medium

13364

773

Add to List

Share
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int out[] = new int[n];
        int pro =1;
       if(n<1){
           return out;
       }
        //getting left array product first in out
        for(int i=0;i<n;i++){
            pro *= nums[i];
            out [i] = pro;
        }
        
        //traverse from right and update output array
        pro = 1;
        for(int i=n-1;i>0;i--){
            out[i] = out[i-1] * pro;
            pro*= nums[i]; 
        }
        out[0] = pro;
        return out;
    }
}
