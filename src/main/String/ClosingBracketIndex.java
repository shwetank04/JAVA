/*Given a string with brackets ('[' and ']') and the index of an opening bracket. Find the index of the corresponding closing bracket.

Example 1:

Input:
S = "[ABC[23]][89]"
pos = 0
Output: 8
Explanation: [ABC[23]][89]
The closing bracket corresponding to the
opening bracket at index 0 is at index 8.
*/

class Sol
{
    int closing (String s, int pos)
    {
        int nextopen =0;
        int result =0;
        // your code here
        char opening = s.charAt(pos);
        for(int i= pos; i< s.length(); i++){
            if(s.charAt(i) == opening) {
                nextopen +=1;
            }
            else if(s.charAt(i) == ']'){
               nextopen -=1;
            }
            if(nextopen == 0){
                result = i;
                break;
            }
        }
        return result;
    }
}
