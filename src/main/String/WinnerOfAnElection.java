Given an array of names (consisting of lowercase characters) of candidates in an election. A candidate name in array represents a vote casted to the candidate. Print the name of candidate that received Max votes. If there is tie, print lexicographically smaller name.

Example 1:

Input:
n = 13
Votes[] = {john,johnny,jackie,johnny,john 
jackie,jamie,jamie,john,johnny,jamie,
johnny,john}
Output: john 4
Explanation: john has 4 votes casted for 
him, but so does johny. john is 
lexicographically smaller, so we print 
john and the votes he received.
  
  
  class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        String [] ans = new String[2];
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int maxValueInMap = 0;
        String winner = "";
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                winner = key;
            }
 
            // If there is a tie, pick lexicographically
            // smaller.
            else if (val == maxValueInMap &&
                winner.compareTo(key) > 0)
                winner = key;
        }
        ans[0] = winner;
        ans[1] = String.valueOf(maxValueInMap);
        return ans;
        
    }
}
