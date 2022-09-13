Given a singly linked list of N nodes.
The task is to find the middle of the linked list. For example, if the linked list is
1-> 2->3->4->5, then the middle node of the list is 3.
If there are two middle nodes(in case, when N is even), print the second middle element.
For example, if the linked list given is 1->2->3->4->5->6, then the middle node of the list is 4.

Example 1:

Input:
LinkedList: 1->2->3->4->5
Output: 3 
Explanation: 
Middle of linked list is 3.


class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         int  i = 0;
         int middle = 0;
         Node last = head;
         int size = 1;
         while(last.next != null) {
             last = last.next;
             size++;
         }
         if(size % 2 == 0){
          middle = ((size+1) / 2);
         }
         else{
          middle =  (int)Math.ceil(size/2);
         }
         Node result = head;
         while(i != middle && result.next !=null){
             result = result.next;
             i++;
         }
         return result.data;
    }
}
