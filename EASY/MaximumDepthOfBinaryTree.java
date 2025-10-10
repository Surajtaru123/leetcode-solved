/*
    104 leetcode : find maximum number of nodes from root to leaf

    Solved on my own. Hurray!
*/

public class MaximumDepthOfBinaryTree {
    
    public int maxDepth(TreeNode root) {
        int left = 0;
        int right = 0;

        if (root == null) {
            return 0;
        }

        // Check if leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }

        left = 1 + maxDepth(root.left);
        right = 1 + maxDepth(root.right);
        return left > right ? left : right;
    }
    
}


