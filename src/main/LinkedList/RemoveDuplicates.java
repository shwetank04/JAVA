Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.

Example 1:

Input:
N = 4
value[] = {5,2,2,4}
Output: 5 2 4
Explanation:Given linked list elements are
5->2->2->4, in which 2 is repeated only.
So, we will delete the extra repeated
elements 2 from the linked list and the
resultant linked list will contain 5->2->4

class Solution
{
    //Function to remove duplicates from unsorted linked list.
	public Node removeDuplicates(Node head)  
    { 
        HashSet<Integer> hs = new HashSet<>(); 
      
        Node current = head; 
        Node prev = null; 
        
        while (current != null)  
        { 
            int curval = current.data; 
              
            //if data at current node is already present in set, we skip the 
            //current node and store the node next to current in link of prev. 
            if (hs.contains(curval)) { 
                prev.next = current.next;
                //deleting current node which contains duplicates. 
                current=null;
            }
            //else we just insert the data at current node in set and update 
            //prev to the current node.
            else { 
                hs.add(curval); 
                prev = current; 
            }
            //updating current to the next node of prev.
            current = prev.next; 
        } 
        return head;
    } 
}
