package DataStructuresAndAlgorithms.binaryTree;


import java.util.*;



public class PreorderTraversalUsingIterative {

public static TreeNode BuildTree(Integer[] arr) {
	if (arr.length == 0 || arr[0] == null) return null;
	
	TreeNode root = new TreeNode(arr[0]);
	Queue<TreeNode> queue = new LinkedList<>();
	queue.offer(root);
	
	int i = 1;
	
	while (!queue.isEmpty() && i < arr.length) {
		TreeNode current = queue.poll();
		
		// Left child
		if (i < arr.length && arr[i] != null) {
			current.left = new TreeNode(arr[i]);
			queue.offer(current.left);
		}
		i++;
		
		// Right child
		if (i < arr.length && arr[i] != null) {
			current.right = new TreeNode(arr[i]);
			queue.offer(current.right);
		}
		i++;
	}
	
	return root;
}

public static List<Integer> preorderTraversal(TreeNode root) {
	List<Integer> result = new ArrayList<>();
	if (root == null) return result;
	
	Stack<TreeNode> stack = new Stack<>();
	stack.push(root);
	
	while (!stack.isEmpty()) {
		TreeNode node = stack.pop();
		//System.out.println("node val " + node.val);
		result.add(node.val);
		
		// Push right first so left is processed first
		if (node.right != null) stack.push(node.right);
		if (node.left != null) stack.push(node.left);
	}
	
	return result;
	


}

     public static void main(String[] args) {
		 
		 
		 Integer[] arr = {1,2,3,4,5,null,8,null,null,6,7,9};
		 TreeNode root = BuildTree(arr);
		 List<Integer> ls = new ArrayList<>();
		 ls = preorderTraversal(root);
		 
	 }

}
