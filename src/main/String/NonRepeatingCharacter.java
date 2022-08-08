Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        char[] a = S.toCharArray();
        
        for(int i=0;i<a.length;i++){
            if(S.indexOf(a[i]) == S.lastIndexOf(a[i])){
                return a[i];
            }
        }
        return '$';
    }
}
