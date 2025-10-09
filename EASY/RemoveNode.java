/*
    203 Leetcode : Remove linked list elements
    
    Solved on my own Hurray!! (Again solved this problem second time)
*/

public class RemoveNode {
    
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode top = dummy;

        while (head != null) {
            while (head != null && head.val == val) {
                dummy.next = head.next;
                head = head.next;
            }
            dummy = head;
            if (head != null) {
                head = head.next;
            }
        }
        return top.next;
    }
    
}

