Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.


Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.
  
  
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int pair =0;
        int j;
        for(int i=0;i<n;i++){
            j= i+1;
            while(j<=n-1){
                if(arr[i] + arr[j] == k){
                    pair++;
                }
                j++;
            }
        }
        return pair;
    }
}

//Optimized Code
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int pair = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++) {
            int b = k-arr[i];
            if(map.containsKey(b)) {
                pair += map.get(b);
            }
            map.putIfAbsent(arr[i],0);
            map.put(arr[i],map.get(arr[i]) + 1);
        }
        return pair;
    }
}
