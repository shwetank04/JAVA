/*Given two strings S1 and S2 print whether they contain any common subsequence (non empty) or not.
NOTE: Print 1 if they have a common subsequence (non empty) else 0.

Example 1:

Input: S1 = "ABEF" , S2 = "CADE"
Output: 1
Explanation: "A", "E", "AE" are in 
both S1 and S2.
*/

class Solution {
    static int commonSubseq(String S1, String S2){
        int ans =0;
        int resu =0;
        for(int i=0;i<S1.length();i++){
            if(S2.contains(Character.toString(S1.charAt(i)))){
                resu += 1;
            }
        }
        if(resu > 0){
           ans = 1; 
        }
        else{
            ans = 0;
        }
        return ans;
    }
}
