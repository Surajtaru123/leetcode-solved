/*
    101. Leetcode : Symmetric Tree 
    
    Solved on my own!! Hurray!
*/

 // Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SymmetryTree {
    public boolean symmetry(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
            return symmetry(p.left, q.right) && symmetry(p.right, q.left);
        }
        else if (p == null && q == null) {
            return true;
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode leftSubTreeRoot = null;
        TreeNode rightSubTreeRoot = null;

        if (root != null) {
            leftSubTreeRoot = root.left;
            rightSubTreeRoot = root.right;
        }
        return symmetry(leftSubTreeRoot, rightSubTreeRoot);
    }
}

