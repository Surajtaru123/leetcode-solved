/*
    leetcode 2 : Medium (They say)
    solved on my own
*/

// Solution class is a simplified version of our code
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode dummy = temp;
        
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            
            int sum = carry + x + y;
            
            // sum could be more than 9
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
            
            // Get next carry : could be 0 or 1
            carry = sum / 10;
            
            if (l1 != null) { l1 = l1.next; }
            if (l2 != null) { l2 = l2.next; }
        }
        
        // At last if carry is not zero
        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }
        return dummy.next;
    }
}

 // Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, temp = null;
        head = temp;
        int val, lastDigit;
        val = 0;

        // Initial setup
        if (l1 != null && l2 != null) {
            val = val + l1.val + l2.val;
            temp = new ListNode(val % 10);
            val /= 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        head = temp;

        while (l1 != null && l2 != null) {
            
            // sum
            val = val + l1.val + l2.val;

            if (val < 10) {
                temp.next = new ListNode(val);
                temp = temp.next;
                val = 0;
            } else {
                lastDigit = val % 10;
                val /= 10;
                temp.next = new ListNode(lastDigit);
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        // If l1 is not null we have to keep adding
        while (l1 != null) {
            val = val + l1.val;
            if (val < 10) {
                temp.next = new ListNode(val);
                temp = temp.next;
                val = 0;
            }
            else {
                lastDigit = val % 10;
                val /= 10;
                temp.next = new ListNode(lastDigit);
                temp = temp.next;
            }
            l1 = l1.next;
        }

        // If l2 is not null we have to keep adding
        while (l2 != null) {
            val = val + l2.val;
            if (val < 10) {
                temp.next = new ListNode(val);
                temp = temp.next;
                val = 0;
            }
            else {
                lastDigit = val % 10;
                val /= 10;
                temp.next = new ListNode(lastDigit);
                temp = temp.next;
            }
            l2 = l2.next;
        }

        // At last if val is not zero
        if (val != 0) {
            temp.next = new ListNode(val);
        }
        
        return head;
    }
}


