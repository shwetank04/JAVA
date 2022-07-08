Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].

 

Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation: 
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.
  


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long mul=1;
        long myArray[] = new long[n];
        
        for(int i=0;i<nums.length;i++){
            mul=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                   mul=mul*nums[j];  
                }
            }
            myArray[i]=mul;
            
            
        }
        return myArray;
	} 
} 
