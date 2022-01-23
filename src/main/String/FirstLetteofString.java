/* Given a string S, the task is to create a string with the first letter of every word in the string

Example 1:

Input: 
S = "geeks for geeks"
Output: gfg

*/


class Solution {
    String firstAlphabet(String S) {
        // code here
        String result = "";
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == ' ') {
                result += S.charAt(i+1);
            }
        }
        return S.charAt(0) + result;
    }
}
