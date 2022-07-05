Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

In case of multiple subarrays, return the subarray which comes first on moving from left to right.

 

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[i] + arr[j] + sum == s && result.size() <1){
                  result.add(i+1);
                  result.add(j+1);
                  break;
              }
              else{
                  sum += arr[j];
              }
          }
          sum = 0;
        }
        if(result.isEmpty()){
            result.add(-1);
            return result;
        }
        return result;
    }
}
