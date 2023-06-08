package top.interview.questions.trees;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }

    public boolean isValid(TreeNode node, long start, long end)
    {
        if(node == null) return true;

        if(node.val>start && node.val<end)
        {
            return isValid(node.left,start, node.val) && isValid(node.right, node.val, end);
        }

        return false;
    }
}
