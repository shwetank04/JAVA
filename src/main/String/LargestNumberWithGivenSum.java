Geek lost the password of his super locker. He remembers the number of digits N as well as the sum S of all the digits of his password. He know that his password is the largest number of N digits that can be made with given sum S. As he is busy doing his homework, help him retrieving his password.

Example 1:

Input:
N = 5, S = 12
Output:
93000
Explanation:
Sum of elements is 12. Largest possible 
5 digit number is 93000 with sum 12.
  
  class Solution
{
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int n, int sum)
    {
        //maximum achievable sum is 9*n. if given sum is 
        //greater than that, we return -1.
        if(sum > 9*n)
        {
            return "-1";
        } 
        String str = "";
        for(int i=0; i<n; i++)
        {
            int temp = 0;
            if(sum!=0)
            //if sum>9 we store 9 in temp as digit or we store the sum.
            temp = sum>9?9:sum;
            
            //storing the number in temp as character in final string.
		    str += (char)(temp+'0');
		    //updating the sum.
		    sum -= temp;
        }
        //returning the final string.
        return str;    
    }
}
