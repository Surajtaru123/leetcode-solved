/*
    24. Leetcode : Swap pairs (linked list)
    
    Solved on my own somehow (Trial and Error : You've to solve this program again!)
*/


public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode top = dummy;
        ListNode t1, t2;
        
        // If empty
        if (head == null) {
            return null;
        }
        
        // If only one node
        if (head.next == null) {
            return head;
        }
        
        // Now we have minimium two nodes
        t1 = head;
        t2 = t1.next;
        while (t2 != null && t1 != null) {
            t1.next = t2.next;
            t2.next = t1;
            dummy.next = t2;
            
            dummy = t1;
            t1 = t1.next;
            if (t1 != null) {
                t2 = t1.next;
            }
        }
        return top.next;
    }
}

