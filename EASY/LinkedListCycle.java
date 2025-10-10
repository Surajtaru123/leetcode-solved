/*
    141 Leetcode:
    
    Space complexity : O(1)
    Time complexity  : O(n)
    
    Approach : Use 2 pointers. First pointer will move forward by one node. Second pointer will move 
                forward by two nodes. 
                Now check if Second pointers next node is First pointer if it is return true
                otherwise go on until Second pointer becomes null.
*/


public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode one = null;
        ListNode two = null;
        ListNode dummy = new ListNode(-1);

        if (head == null) {
            return false;
        }

        dummy.next = head;
        one = dummy;
        two = dummy;
        do {
            one = one.next;
            two = two.next;
            if (two != null) {
                two = two.next;
            }
            if (two != null && two.next == one) {
                return true;
            }
        } while (two != null);
        return false;
    }
}

