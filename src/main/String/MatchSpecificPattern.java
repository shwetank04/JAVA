Given a dictionary of words and a pattern. Every character in the pattern is uniquely mapped to a character in the dictionary. Find all such words in the dictionary that match the given pattern. 

Example 1:

Input:
N = 4
dict[] = {abb,abc,xyz,xyy}
pattern  = foo
Output: abb xyy
Explanation: xyy and abb have the same
character at index 1 and 2 like the
pattern.


class GfG
{
/* The function returns an array of strings 
present in the dictionary which matches
the string pattern.
You are required to complete this method */
	public static String encodeString(String str)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String res = "";
		int i = 0;

		for (char ch : str.toCharArray())
		{
			if (!map.containsKey(ch))
			    map.put(ch, i++);
	        res += String.valueOf(map.get(ch));
		}
		return res;
	}


	public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
		int len = pattern.length();
		String hash = encodeString(pattern);
		 ArrayList<String> res = new ArrayList<String>();
		  for (int i = 0;i < dict.size();i++)
    	    if (dict.get(i).length() == len && hash.equals(encodeString(dict.get(i))))
    		   res.add(dict.get(i));
		return res;
	}
}
