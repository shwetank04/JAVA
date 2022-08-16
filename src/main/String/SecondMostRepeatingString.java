Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.

Note: No two strings are the second most repeated, there will be always a single string.

Example 1:

Input:
N = 6
arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
Output: bbb
Explanation: "bbb" is the second most 
occurring string with frequency 2.

  

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) +1 );
            }
            else{
                map.put(arr[i],1);
            }
        }
       ArrayList<Integer> List=new ArrayList<Integer>(map.values());
       Collections.sort(List);
       int n=List.size();
       return getKey(map,List.get(n-2));
    }
    String getKey(Map<String,Integer> map, Integer value)
    {
       for(String key : map.keySet())
       {
           if(value.equals(map.get(key)))
           {
               return key;
           }
       }
       return null;
    }
}
