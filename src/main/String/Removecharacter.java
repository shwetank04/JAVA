/* Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).

Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".

*/

class Solution{
    static String removeChars(String string1, String string2){
        // code here
        for(int i=0;i<string2.length();i++){
            if(string1.contains(string2.charAt(i)+"")){
            string1 = string1.replace(string2.charAt(i)+"","");
            }
        }
        return string1;
    }
}
