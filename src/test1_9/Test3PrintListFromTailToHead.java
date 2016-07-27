package test1_9;

import java.util.ArrayList;

public class Test3PrintListFromTailToHead {
	
    public static class ListNode {
       int val;
       ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
		while(listNode != null){
			list.add(0, listNode.val);
			listNode = listNode.next;
		}
		return list;
    }
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		
		ArrayList<Integer> list = new Test3PrintListFromTailToHead().printListFromTailToHead(n1);
		System.out.println(list.toString());
	}
}
