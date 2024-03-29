You are given a number n. You need to find the digital root of n. DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.

Example 1:

Input:
n = 1
Output:  1
Explanation: Digital root of 1 is 1
Example 2:

Input:
n = 99999
Output: 9
Explanation: Sum of digits of 99999 is 45
which is not a single digit number, hence
sum of digit of 45 is 9 which is a single
digit number.

class Solution
{
    // method to calculate digit sum of a number
    static int sumDigits(int n)
    {
        // returning n if n / 10 is 0
        if(n/10==0)
            return n;
         //else adding digit sum
        else
            return n%10+sumDigits(n/10);
    }
    
    // method to calculate the single digit answer
    public static int digitalRoot(int n)
    {
        // if n is less than n then returning the n
        if(n/10==0)
            return n;
         // else calling sumDigits function 
        else
            return digitalRoot(sumDigits(n));
    }
}
