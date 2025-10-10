/*
    144 leetcode : Binary tree pre-order traversal 
    
    1 ms
    
    solved on my own Hurray!
*/

public class BinaryPreOrderTraversal {
    
    List<Integer> list = new ArrayList<>();

    public void preOrder(TreeNode p) {
        if (p != null) {
            list.add(p.val);
            preorderTraversal(p.left);
            preorderTraversal(p.right);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return list;
    }
    
}


