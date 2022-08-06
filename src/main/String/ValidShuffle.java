class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        int n=str1.length();
        if(str2.length()!=n)
            return  false;
        if(n<=2 && str1 ==  str2)
            return true;
        String A = str1.concat(str1);
         int count = 0;
       for (int i = 0; i < A.length(); i++) {
        if (A.charAt(i) == str2.charAt(count)) {
            count++;
        } else {
            count = 0;
        }
        if (count == str2.length()) {
            return true;
        }
       }
            return false;
            
        }
    }
