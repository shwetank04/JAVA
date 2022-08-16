Given a string str and another string patt. Find the minimum index of the character in str that is also present in patt.


Example 1:

Input:
str = geeksforgeeks
patt = set
Output: 1
Explanation: e is the character which is
present in given str "geeksforgeeks"
and is also presen in patt "set". Minimum
index of e is 1. 

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        int min = str.length();
        boolean found = false;
        // Your code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), Math.min(map.get(str.charAt(i)),i));
            }
            else{
            map.put(str.charAt(i), i);
            }
        }
    for(int i = 0;i<patt.length();i++) {
        if(map.containsKey(patt.charAt(i))){
            found= true;
            if(map.get(patt.charAt(i)) < min){
                min = map.get(patt.charAt(i));
            }
        }
    }
    if(found){
    return min;
    }
    return -1;
    }
}
