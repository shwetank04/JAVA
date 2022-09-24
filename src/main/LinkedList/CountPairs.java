Given two linked list of size N1 and N2 respectively of distinct elements, your task is to complete the function countPairs(), which returns the count of all pairs from both lists whose sum is equal to the given value X.
Note: The 2 numbers of a pair should be parts of different lists.

Example 1:

Input:
L1 = 1->2->3->4->5->6
L2 = 11->12->13
X = 15
Output: 3
Explanation: There are 3 pairs that
add up to 15 : (4,11) , (3,12) and (2,13)

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        int count = 0;
        // sort head1 in ascending order and
        // head2 in descending order
        HashSet<Integer> h = new HashSet<Integer>();
        
        Iterator<Integer> itr1 = head1.iterator();
        
        while (itr1.hasNext()) 
        {
            // adding all values from list1 to hashmap
            h.add(itr1.next());
        }
        
        Iterator<Integer> itr2 = head2.iterator();
        
        while (itr2.hasNext())
        {
            if (h.contains(x - itr2.next()))
            // looking up for required value in hashmap
            {
                count++;
            }
        }
        // required count of pairs
        return count;
    }
    }
