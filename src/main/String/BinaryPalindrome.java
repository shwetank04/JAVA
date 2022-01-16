/* Given a non-negative integer N. Check whether the Binary Representation of the number is Palindrome or not. 
Note: No leading 0’s are being considered.

Example 1:

Input:
N = 5
Output: 1
Explanation: The Binary Representation of
5 is 101 which is a Palindrome.

*/

class Sol
{
    int binaryPalin (long N)
    {
      StringBuilder sb=new StringBuilder(Long.toBinaryString(N));
        sb.reverse();
        if(String.valueOf(sb).equals(Long.toBinaryString(N)))
        return 1;
        return 0;
    }
}
