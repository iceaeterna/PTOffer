package test1_9;

public class Test4ReConstructBinaryTree {
	public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	private TreeNode createTree(int []pre,int sp, int ep, int []in, int si, int ei){
		if(ep < sp || ei < si) return null;
		int index;
		for(index = si; index <= ei; index++){
			if(in[index] == pre[sp]) break;
		} 
		TreeNode root = new TreeNode(pre[sp]);
		root.left = createTree(pre,sp+1,sp+index-si,in,si,index-1);
		root.right = createTree(pre,sp+index-si+1,ep,in,index+1,ei);
		return root;
	} 
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		return createTree(pre, 0, pre.length-1, in, 0, in.length - 1);
    }
	
	
	private static void preOrder(TreeNode root){
		if(root != null)
			System.out.print(root.val+" ");
		if(root.left!=null) preOrder(root.left);
		if(root.right!=null) preOrder(root.right);
	}
	
	public static void main(String[] args) {
		int pre[] = {1,2};
		int in[] = {2,1};
		TreeNode root = new Test4ReConstructBinaryTree().reConstructBinaryTree(pre, in);
		preOrder(root);
	}
}
