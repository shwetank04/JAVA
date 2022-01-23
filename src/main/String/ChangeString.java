/* Given a string S, the task is to change the complete string to Uppercase or Lowercase depending upon the case for the first character.

Example 1:

Input:
S = "abCD"
Output: abcd
Explanation: The first letter (a) is 
lowercase. Hence, the complete string
is made lowercase.
 
 */
 
 class Solution{
    String modify(String s){
        // your code here
        char first = s.charAt(0);
        char firstLower = Character.toUpperCase(first);
        if(first == firstLower){
         return s.toUpperCase();   
        }
        else return s.toLowerCase(); 
    }
}
