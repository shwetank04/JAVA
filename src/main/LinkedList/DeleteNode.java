Given a singly linked list and an integer x.Delete xth node from the singly linked list.

Example 1:

Input: 1 -> 3 -> 4 
       x = 3
Output: 1 -> 3
Explanation:
After deleting the node at 3rd
position (1-base indexing), the
linked list is as 1 -> 3. 
  
class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	Node curr = head;
	if(x == 1){
	    head = curr.next;
	    return head;
	}
	int i = 1;
	 while(curr != null){
	   if(i == x-1 && curr.next == null){
	       curr.next = null;
	       break;
	   }  
	   if(i == x-1){
	     curr.next = curr.next.next;
	     break;
	   }
	   curr = curr.next;
	   i++;
	 }
	 return head;
    }
}
