Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

Example 1:

Input:
N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2
Explanation: All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.

class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int zero =0,one=0,two = 0;
        Node curr = head;
        while(curr!=null){
            if(curr.data == 0){
                zero++;
            }
            else if(curr.data==1){
                one++;
            }
            else{
              two++;
            }
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
             if(zero>0){
                curr.data = 0; 
                zero--;
            }
            else if(one>0){
                curr.data = 1;
                one--;
            }
            else{
              curr.data =2;
            }
            curr = curr.next;
        }
        return head;
        
    }
}
