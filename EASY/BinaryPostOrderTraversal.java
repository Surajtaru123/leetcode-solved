/*
    145 leetcode : binary tree post order traversal
    
    solved on my own Hurray!
*/

public class BinaryPostOrderTraversal {
    
    List<Integer> list = new ArrayList<>();
    
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            list.add(root.val);
        }
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return list;
    }
}

