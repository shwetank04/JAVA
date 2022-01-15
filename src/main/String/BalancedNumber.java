/* Check if the number is balanced
Given an integer N which has odd number of digits, find whether the given number is a balanced or not.

An odd digit number is called a balanced number if the sum of all digits to the left of the middle digit and the sum of all digits to the right of the middle digit is equal.

Example 1:

Input:
N = 1234006
Output: 1 
Explanation: Total number of digits in
N = 7. Middle digit is 4. LHS = 1+2+3 = 6
and RHS = 0+0+6 = 6. LHS is equal to RHS.

*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String N = sc.next ();

            if (new Sol().balancedNumber (N))
    		    System.out.println (1);
    		else
    		    System.out.println (0);
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean balancedNumber(String N)
    {
        // your code here
        int a = 0;
        int b = 0;
        for(int j=0 ; j<N.length()/2; j++){
            a+=N.charAt(j);
            }
        for(int k = N.length() -1 ; k>N.length()/2; k--){
            b+=N.charAt(k);
            }
         if(a==b){
                return true;
            }
            else{
                return false;
            }
        
    }
}
