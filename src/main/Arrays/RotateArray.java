Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer. 

 

Example 1:

Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated
by 2 elements, it becomes 3 4 5 1 2.
  

class Solution
{
    //Function to reverse any part of the array.
    static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 

        while (start < end) { 
            //Swapping values at start index and end index.
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp;
            //Updating the values of start and end.
            start++; 
            end--; 
        } 
    }
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        d%=n;
        //First reversing d elements from starting index.
        rvereseArray(arr, 0, d-1);
        //Then reversing the last n-d elements.
        rvereseArray(arr, d, n - 1); 
        //Finally, reversing the whole array.
        rvereseArray(arr, 0, n - 1); 
    }
}
