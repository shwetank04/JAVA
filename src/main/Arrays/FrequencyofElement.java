Given an array A[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all elements from 1 to N.
Note: The elements greater than N in the array can be ignored for counting and please read your task section of the problem carefully to understand how to output the array.


Example 1:

Input:
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.



class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int count = 0;
        int result[] = new int[N];
        int k=0;
        for(int i=1;i<=P;i++){
            count =0;
            for(int j=0;j<N;j++){
                if(arr[j] == i){
                    count++;
                }
            }
            if(k<N){
            result[k] = count;
            }
            k++;
        }
        for(int l=0;l<N;l++){
            arr[l] = result[l];
        }
    }
}
