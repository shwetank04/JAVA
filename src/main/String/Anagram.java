Given two stringsaandbconsisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have samecharacters with
        same frequency. So, both are anagrams.
  

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        
        Arrays.sort(first);
        Arrays.sort(second);
        
        String c = new String(first);
        String d = new String(second);
        
        if(c.equals(d)){
            return true;
        }
        
        return false;
    }
}
