Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
  
  
  

class GFG {
    // Returns length of the largest subarray
    // with 0 sum
    static int maxLen(int arr[], int n)
    {
        int max_len = 0;
 
        // Pick a starting point
        for (int i = 0; i < n; i++) {
            // Initialize curr_sum for every
            // starting point
            int curr_sum = 0;
 
            // try all subarrays starting with 'i'
            for (int j = i; j < n; j++) {
                curr_sum += arr[j];
 
                // If curr_sum becomes 0, then update
                // max_len
                if (curr_sum == 0)
                    max_len = Math.max(max_len, j - i + 1);
            }
        }
        return max_len;
    }

  
  
  //Optimized Code
  class GfG
{
    int maxLen(int arr[], int n)
    {
        // Creates an empty hashMap
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum = 0;
        int ans = 0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
            if(sum ==0){
                ans =i+1;
            }
            else{
            if(map.containsKey(sum)){
                ans = Math.max(ans,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
    }
        return ans;
    }
}
