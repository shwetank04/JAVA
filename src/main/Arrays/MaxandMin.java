Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

 

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
  
class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long max = 0;
        long min = a[0];
        for(int i=0;i<n;i++){
            if(a[i] >= max){
                max = a[i];
            }
            else if(a[i] <= min){
                min = a[i];
            }
            else{
                continue;
            }
        }
        return new pair(min,max);
        
    }
}
