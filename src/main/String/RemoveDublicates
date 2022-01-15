/* Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same. 

Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence

*/


class Solution {
String removeDups(String input) {
// code here
String result = "";
for (int i = 0; i < input.length(); i++) {
if(!result.contains(String.valueOf(input.charAt(i)))) {
result += String.valueOf(input.charAt(i));
         }
      }
return result;
   }
}
