package DataStructuresAndAlgorithms.binaryTree;

public class SymmetricTree {
     
     public static Boolean isSymmetricTree(TreeNode left, TreeNode right) {
		 
		 if(left == null && right == null) {
			  return true;
		 }
		 
		 if(left == null || right == null) {
			  return false;
		 }
		 
		 if(left.val != right.val) {
			 return false;
		 }
		 
		 
		 return isSymmetricTree(left.left, right.right) && isSymmetricTree(left.right, right.left);
		 
	 }
   
     public static void main(String[] args) {
		 
		 TreeNode root = new TreeNode(1);
		 root.left = new TreeNode(2);
		 root.right = new TreeNode(2);
		 root.left.left = new TreeNode(3);
		 root.right.right = new TreeNode(3);
		 
		 Boolean result = isSymmetricTree(root.left, root.right);
		 
	 }
	 
	 
 
}
