package test10_19;

public class Test14FindKthToTail {
	
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
    public ListNode FindKthToTail(ListNode head,int k) {
    	if(k <= 0) return null;
    	ListNode pre = head;
		while(--k > 0){
			if(head == null) return null;
			head = head.next;
		}
		
		if(head == null) return null;
		while(head.next != null){
			head = head.next;
			pre = pre.next;
		}
		return pre;
    }	
    
    public static void main(String[] args) {
		ListNode node = new ListNode(1), p = node;
    	for(int i = 2; i < 6; i++){
			p.next = new ListNode(i);
			p = p.next;
		}
    	
    	System.out.println(new Test14FindKthToTail().FindKthToTail(node, 6).val);
	}
	
}


