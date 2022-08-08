Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2 while preserving the order.
Note: All occurrences of every character in str1 should map to the same character in str2

Example 1:

Input:
str1 = aab
str2 = xxy
Output: 1
Explanation: There are two different
charactersin aab and xxy, i.e a and b
with frequency 2and 1 respectively.

class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length() != str2.length()){
            return false;
        }
        HashMap<Character,Character> first = new HashMap<>();
        HashMap<Character,Boolean> second = new HashMap<>();
        
        for(int i=0;i<str1.length();i++){
           if(first.containsKey(str1.charAt(i))){
               if(first.get(str1.charAt(i)) != str2.charAt(i)){
                   return false;
               }
           }
           else{
               if(second.containsKey(str2.charAt(i))){
                   return false;
               }
               else{
                   first.put(str1.charAt(i),str2.charAt(i));
                   second.put(str2.charAt(i),true);
               }
           }
}
return true;
}
}
