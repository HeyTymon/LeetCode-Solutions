package top.interview.questions.trees;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return nodeSymmetric(root,root);
    }

    public boolean nodeSymmetric(TreeNode leftNode, TreeNode rightNode)
    {
        if(leftNode == null && rightNode == null) return true;
        if(leftNode == null || rightNode == null) return false;

        return (leftNode.val == rightNode.val
                && nodeSymmetric(leftNode.left,rightNode.right)
                && nodeSymmetric(leftNode.right,rightNode.left));
    }
}
