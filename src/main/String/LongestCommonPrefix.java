Given a array of N strings, find the longest common prefix among all strings present in the array.


Example 1:

Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.


class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String result="";
        int min=arr[0].length();
        int index = 0;
        String shortest = "";
        for(int i=0;i<n;i++) {
            if(arr[i].length()<min){
               min = arr[i].length();
               index = i;
            }
        }
        shortest = arr[index];
        int j=0;
        while(j<n && shortest.length()>0){
            if(arr[j].startsWith(shortest)) {
                result = shortest;
                j++;
            }
            else{
               result =  "";
               shortest = shortest.substring(0,shortest.length()-1);
               j=0;
            }
        }
    if(result.length()>0){
        return result;
    }
    return "-1";
}
}
