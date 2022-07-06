Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation: For second test case 
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2).
  
  
  class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int result = -1;
        int sumbefore = 0;
        int sumafter =0;
        if(n==1){
            result = 1;
        }
            for(int i=0;i<n;i++){
                    for(int j=0;j<i;j++){
                        sumbefore += arr[j];
                    }
                    for(int k=n-1;k>i;k--){
                        sumafter += arr[k];
                    }
                    if(sumbefore == sumafter){
                        result = i+1;
                    }
                    else{
                        sumbefore = 0;
                        sumafter = 0;
                    }
                }
        return result;
    }
}
