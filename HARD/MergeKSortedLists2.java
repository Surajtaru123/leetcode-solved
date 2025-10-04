/*
    Divide and Conquer approach for Merging k sorted lists
    I just read we have to use divide and conquer and i did it on my own
    
    Hurray!!!
    
    Leetcode 23 Hard 
    solved (1 ms)
*/

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}

public class MergeKSortedLists2 {

    public ListNode merge(ListNode p, ListNode q) {
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
    
    public ListNode recursive(ListNode[] lists, int l, int h) {
        ListNode m = null;
        
        // base condition : just return a single list
        if (l == h) {
            return lists[l];
        }
        
        // Divide -> call on left then right and then merge
        if (l < h) {
            int mid = (l + h) / 2;
            ListNode left = recursive(lists, l, mid);
            ListNode right = recursive(lists, mid + 1, h);
            m = merge(left, right);
        }
        return m;
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        return recursive(lists, 0, lists.length - 1);
    }
}






