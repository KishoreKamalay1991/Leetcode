public class pathsumbinarytree {

    public static boolean haspathsum(TreeNode root, int sum) {
        if (root == null) {
          return false;
        }

        return dfs(root, sum);

    }

    public static boolean dfs(TreeNode node, int sum) {

        sum -= node.val;

        if(node.left == null && node.right == null) {
            return sum == 0;
        }

        boolean left = false, right = false;
        if(node.left != null) {
            left = dfs(node.left, sum);
        }
        if (node.right != null) {
            right = dfs(node.right, sum);
        }

        return left || right;


    }

    public static void main(String[] args) {



    }


}
