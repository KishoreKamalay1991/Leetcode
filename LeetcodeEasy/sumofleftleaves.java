public class sumofleftleaves {

    public static int sumOfLeftLeaves(TreeNode root) {

        if(root == null) {
           return 0;
        }

        int sum = 0;

        if(root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;

    }

    public static void main(String[] args) {


        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        int result = sumOfLeftLeaves(root1);
        System.out.println("result " + result);

    }

}
