package test10_19;


public class Test15ReverseList {
	
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	    
	public ListNode ReverseList(ListNode head) {
		if(head == null) return null;
		if(head.next == null) return head;
		ListNode prev = null, next = null;
		while(head != null){
			next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev; 
    }
	
	public static void main(String[] args) {
		ListNode node = new ListNode(1), p = node;
    	for(int i = 2; i < 6; i++){
			p.next = new ListNode(i);
			p = p.next;
		}
    	
    	node = new Test15ReverseList().ReverseList(node);
    	
    	while(node != null){
    		System.out.println(node.val+ " ");
    		node = node.next;
    	}
	}
}
