/*
    Leetcode 23 hard :
    
    Following is the brute force approach
    Space : O(1)
    Time  : O(n^2) (roughly)
*/


class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeKSortedLists {
    public ListNode merge(ListNode p, ListNode q) {
        // 1 -> 2 -> 5 -> 10 -> 15
        // 3 -> 4
        ListNode t = new ListNode(0);
        ListNode h = t;
        while (p != null && q != null) {
            if (p.val > q.val) {
                t.next = q;
                q = q.next;
            } else {
                t.next = p;
                p = p.next;
            }
            t = t.next;
        }
        if (p != null) {
            t.next = p;
        }
        if (q != null) {
            t.next = q;
        }
        p = null;
        q = null;
        return h.next;
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode m = merge(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            m = merge(m, lists[i]);
        }
        return m;
    }
}

