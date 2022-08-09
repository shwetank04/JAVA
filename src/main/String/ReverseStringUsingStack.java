class Solution {
    
    public String reverse(String S){
        //code here
        char[] input = S.toCharArray();
        String result ="";
        Stack<Character> s = new Stack<>();
        for(int i=0;i<input.length;i++){
            s.push(input[i]);
        }
        for(int i=0;i<input.length;i++){
            result+= s.pop();
        }
        return result;
    }

}
