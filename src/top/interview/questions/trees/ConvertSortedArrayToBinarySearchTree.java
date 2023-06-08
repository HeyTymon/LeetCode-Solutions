package top.interview.questions.trees;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return constructBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructBinaryTree(int[] nums, int leftBoundary, int rightBoundary) {

        if (leftBoundary > rightBoundary) return null;

        int mid = leftBoundary + (rightBoundary - leftBoundary) / 2;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left = constructBinaryTree(nums, leftBoundary, mid - 1);
        midNode.right = constructBinaryTree(nums, mid + 1, rightBoundary);

        return midNode;
    }
}
