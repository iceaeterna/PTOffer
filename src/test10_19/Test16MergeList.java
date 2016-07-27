package test10_19;


public class Test16MergeList {
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	
	public ListNode Merge(ListNode list1,ListNode list2) {
		ListNode head = list1;
		ListNode prev = list1,next;
		while(list1 != null || list2 != null){
        	if(list2 == null){
        		break;
        	}else if(list1 == null){
        		if(prev == null) {
        			head = list2;
        			break;
        		}
        		prev.next = list2;
        		break;
        	}else if(list1.val <= list2.val){
        		prev = list1;
        		list1 = list1.next;
        	}else{
        		next = list2.next;
        		list2.next = list1;
        		prev.next = list2;
        		prev = list2;
        		list2 = next;
        	}
        }
		return head;
	}
	
	
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1), p = list1;
    	for(int i = 3; i < 9; i+=2){
			p.next = new ListNode(i);
			p = p.next;
		}
    	
    	ListNode list2 = new ListNode(2);
    	p = list2;
    	for(int i = 4; i < 10; i+=2){
			p.next = new ListNode(i);
			p = p.next;
		}
    	
//		ListNode list1 = new ListNode(1);
//		ListNode list2 = new ListNode(2);;
    	list1 = new Test16MergeList().Merge(list1,list2);
    	
    	while(list1 != null){
    		System.out.print(list1.val+ " ");
    		list1 = list1.next;
    	}
	}
}
