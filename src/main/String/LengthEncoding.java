Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.

Example 1:

Input:
str = aaaabbbccc
Output: a4b3c3
Explanation: a repeated 4 times
consecutively b 3 times, c also 3
times.

class GfG
 {
	String encode(String str)
	{
          //Your code here
      String des="";
		for(int i=0;i<str.length();i++)
		{
			
			des+=str.charAt(i);
			int c=1;
		
			while(i+1<str.length() && str.charAt(i) ==str.charAt(i+1))
			{
			c++;
			i++;
			}
			des+=c+"";
		}
		return des;
	}
	
 }
