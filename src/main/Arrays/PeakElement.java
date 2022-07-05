An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 


Example 1:

Input: 
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
If 2 is returned then the generated output will be 1 else 0



class Solution
{
	int result;
	public int peakElement(int[] arr,int n){
    int max=arr[0];
       int index=0;
       int i=0;
       while( i<arr.length){
           if(arr[i]>max) {
               max = arr[i];
               index = i;
           }
           i++;
       }
       return index;
   }
}
