Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balaced pairs, with 0 number of 
unbalanced bracket.
                                                                                                    
                                                                                                    
                                                                                                    
    class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s = new Stack<>();
        for(int i=0;i<x.length();i++){
            if(opening(x.charAt(i))){
                s.push(x.charAt(i));
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else if(!isMatching(s.peek(),x.charAt(i))) {
                    return false;
                }
                else{
                    s.pop();
                }
            }
            
        }
        return s.isEmpty();
        
    }
   static boolean opening(char x){
        if(x=='[' || x=='{' || x=='('){
            return true;
        }
            return false;
    } 
   static boolean isMatching(char b, char c)
    {
        if(b=='{' && c=='}')
            return true;
        else if(b=='[' && c==']')
            return true;
        else if(b=='(' && c==')')
            return true;
        return false;
    }
  }
