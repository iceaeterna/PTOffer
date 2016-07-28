package test20_29;

import java.util.ArrayList;

public class Test22PrintFromTopToBottom {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> tree = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        if(root != null) tree.add(root);
        while(!tree.isEmpty()){
        	TreeNode p = tree.remove(0);
        	values.add(p.val);
        	if(p.left != null) tree.add(p.left);
        	if(p.right != null) tree.add(p.right);
        }
        return values;
    }
	
}
