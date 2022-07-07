Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int j=0;
        for(int i=0;i<n;i++){
            j =i+1;
            while(j<n){
                if(arr[i] < arr[j]){
                    break;
                }
                else if(j==n-1){
                    result.add(arr[i]);
                }
                j++;
            }
        }
        result.add(arr[n-1]);
        return result;
    }
}
