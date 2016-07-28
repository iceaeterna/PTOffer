package test20_29;

import java.util.Stack;

public class Test26ConvertBST {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	 public TreeNode Convert(TreeNode root) {
        if(root==null)
            return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        TreeNode pre = null;
        boolean isFirst = true;
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            System.out.print(p.val+ " ");
            if(isFirst){
                root = p;
                pre = root;
                isFirst = false;
            }else{
                pre.right = p;
                p.left = pre;
                pre = p;
            }      
            p = p.right;
        }
        return root;
	 }
	 
	 public TreeNode ConvertSubTree(TreeNode root, int leftOrRight){
		 TreeNode bottom = root;
		 if(leftOrRight == 1){
			 while(bottom.right != null){
				 bottom = bottom.right;
			 }
		 }else if(leftOrRight == 2){
			 while(bottom.left != null){
				 bottom = bottom.left;
			 }
		 }
		
		 if(root.left != null){
			 TreeNode leftBottom = ConvertSubTree(root.left, 1);
			 root.left = leftBottom;
			 leftBottom.right = root;
		 }
		 
		 if(root.right != null ){
			 TreeNode rightBottom = ConvertSubTree(root.right, 2);
			 root.right = rightBottom;
			 rightBottom.left = root;;
		 }
		 return bottom;
	 }
	 
	 public TreeNode Convert2(TreeNode root) {
		 if(root == null) return null;
		 TreeNode start = root;
		 while(start.left != null){
			 start = start.left;
		 }
		 ConvertSubTree(root, 3);
//		 
//		 if(root.left != null){
//			 TreeNode leftBottom = ConvertSubTree(root.left, true);
//			 root.left = leftBottom;
//			 leftBottom.right = root;
//		 }
//		 
//		 if(root.right != null ){
//			 TreeNode rightBottom = ConvertSubTree(root.right, false);
//			 root.right = rightBottom;
//			 rightBottom.left = root;
//		 }
		 return start == null ? root : start;
	 }
	 
	 public TreeNode Convert3(TreeNode root) {
	        if(root==null)
	            return null;
	        if(root.left==null&&root.right==null)
	            return root;
	        TreeNode left = Convert(root.left);
	        TreeNode p = left;
	        while(p!=null&&p.right!=null){
	            p = p.right;
	        }
	        if(left!=null){
	            p.right = root;
	            root.left = p;
	        }
	        TreeNode right = Convert(root.right);
	        if(right!=null){
	            right.left = root;
	            root.right = right;
	        }
	        return left!=null?left:root;       
    }
	 
	 protected TreeNode leftLast = null;
     public TreeNode Convert4(TreeNode root) {
	        if(root==null)
	            return null;
	        if(root.left==null&&root.right==null){
	            leftLast = root;
	            return root;
	        }
	        TreeNode left = Convert(root.left);
	        if(left!=null){
	            leftLast.right = root;
	            root.left = leftLast;
	        }
	        leftLast = root;
	        TreeNode right = Convert(root.right);
	        if(right!=null){
	            right.left = root;
	            root.right = right;
	        }
	        return left!=null?left:root;       
	 }
	 
	public static void traverse(TreeNode root){
		System.out.print(root.val+ " ");
		while(root.right != null){
			System.out.print(root.right.val+ " ");
			root = root.right;
		}
		
		while(root.left != null){
			System.out.print(root.left.val+ " ");
			root = root.left;
		}
	}
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(10);
		TreeNode n2 = new TreeNode(5);
		TreeNode n3 = new TreeNode(15);
		TreeNode n4 = new TreeNode(2);
		TreeNode n5 = new TreeNode(8);
		TreeNode n6 = new TreeNode(12);
		TreeNode n7 = new TreeNode(18);
		TreeNode n8 = new TreeNode(1);
		TreeNode n9 = new TreeNode(3);
		TreeNode n10 = new TreeNode(6);
		TreeNode n11 = new TreeNode(9);
		TreeNode n12 = new TreeNode(11);
		TreeNode n13 = new TreeNode(13);
		TreeNode n14 = new TreeNode(16);
		TreeNode n15 = new TreeNode(19);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n4.left = n8;
		n4.right = n9;
		n5.left = n10;
		n5.right = n11;
		n6.left = n12;
		n6.right = n13;
		n7.left = n14;
		n7.right = n15;
		traverse(new Test26ConvertBST().Convert2(n1));
		
	}
    
}
