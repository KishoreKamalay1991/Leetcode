public class searchinbinarysearchtree {

    public static TreeNode searchBST(TreeNode root, int val) {

        if(root == null || root.val == val) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        }

        return searchBST(root.right, val);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;

        TreeNode result = searchBST(root, val);

        if (result != null) {
            System.out.println("Found node with value: " + result.val);
            System.out.println("Subtree rooted at " + result.val + ":");

        } else {
            System.out.println("Value " + val + " not found in BST");
        }

        // Test with another value
        System.out.println("\nSearching for value 5:");
        TreeNode result2 = searchBST(root, 5);
        if (result2 != null) {
            System.out.println("Found: " + result2.val);
        } else {
            System.out.println("Value 5 not found in BST");
        }



    }

}
