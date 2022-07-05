Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.
Example 2:

Input:
N = 5
a[] = {2,3,1,2,3}
Output: 2 3 
Explanation: 2 and 3 occur more than once
in the given array.

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int j = 0;
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            j = i+1;
           while(j<n){
            if(arr[i] == arr[j] && !result.contains(arr[i])){
                result.add(arr[i]);
                }
                else{
                     j += 1;
                }
            }
        }
        if(result.isEmpty()){
            result.add(-1);
            return result;
        }
        else{
            return result;
        }
    }
}
