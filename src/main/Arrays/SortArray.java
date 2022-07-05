Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
  
  
  

class Solution
{
    public static void sort012(int a[], int n) {
    int zeros=0,ones=0,two=0;
    for(int i=0; i<n; i++)
    {
        if(a[i]==0){
        zeros++;
        }
        else if(a[i]==1) {
            ones++;
        }
        else {
            two++;
        }
    }
    for(int i=0; i<n; i++)
    {
        if(zeros > 0) { 
            a[i] = 0; 
            zeros--; 
        }
        else if(ones > 0) { 
            a[i] = 1; 
            ones--; 
            
        }
        else {
            a[i] = 2;
            }
        }
    }
}
