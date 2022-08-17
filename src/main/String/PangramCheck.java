Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet (either lowercase or uppercase or both). For example, we say the letter A is present in the string if either 'a' is present or 'A' is present.

Example 1:

Input:
S = Bawds jog, flick quartz, vex nymph
Output: 1
Explanation: In the given input, there
are all the letters of the English
alphabet. Hence, the output is 1.


class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
//using a hash table to mark the characters present in the string.
        Boolean[] mark = new Boolean[26];
        for (int i = 0; i < 26; i++)
            mark[i] = false;
	    
	    //iterating over the string.
	    for (int i = 0; i < str.length(); i++)
	    {
	       //marking index of current character as true in hash table.
	        
	       //if we get uppercase character, we subtract 'A' from it
           //to get its index (in terms of 0 to 25).
	       if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
	            mark[str.charAt(i) - 'A'] = true;
	            
	       //if we get lowercase character, we subtract 'a' from it
           //to get its index (in terms of 0 to 25).
	       else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
	            mark[str.charAt(i) - 'a'] = true;
	            
	    }
	    
	    //returning false if any letter of alphabet is unmarked.
	    for (int i = 0; i < 26; i++)
	        if (!mark[i])
	            return false;
	    
	    //if all letters of alphabet are present then returning true.        
	    return true;
    }
}
