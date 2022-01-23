/*
You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG

*/

class Reverse
{
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder sb = new StringBuilder();
        for(int i=str.length() -1 ; i >=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
