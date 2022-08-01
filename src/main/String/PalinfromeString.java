Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome

class Solution {
    int isPalindrome(String S) {
        // code here
        String reverse = "";
        for(int i=S.length()-1;i>=0;i--){
            reverse += S.charAt(i);
        }
        if(reverse.equals(S)){
            return 1;
        }
        return 0;
    }
};
