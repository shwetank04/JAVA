/* Given a string S and another string patt. Find the character in patt that is present at the minimum index in S.
 

Example 1:

Input: S = "zsyle", patt = "bjz"
Output: "z"

*/


class Solution{
    
    // Function to find the character in patt which is present in str at min index
    public static String printMinIndexChar(String S, String patt){
        int minIndex = Integer.MAX_VALUE;
            for(int i =0; i<patt.length(); i++){
                for(int j =0; j<S.length(); j++){
                if(patt.charAt(i) == S.charAt(j) && j < minIndex){
                    minIndex = j;
                    break;
                    }
                }
	        }
	        if(minIndex != Integer.MAX_VALUE){
	        	 return Character.toString(S.charAt(minIndex));
	        }
	        else return "$";
        }
	}
