package assignmentHV.gradedAssign_2;

import java.util.*;
public class mergeAndSortLinkedList {

	static class Node{
		int val;
		Node next = null;
		Node(int val){
			this.val = val;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter no of elements in list-1 :");
		n1 = sc.nextInt();
		Node head1 = null;
		Node temp = null;
		System.out.println("Enter List - 1 elements : ");
		for(int i = 0 ; i < n1 ; i++) {
			int num = sc.nextInt();
			if(head1 == null)
				head1 = temp = new Node(num);
			else {
				temp.next = new Node(num);
				temp = temp.next;
			}
		}
		temp = null;
		Node head2 = null;
		System.out.println("Enter no of elements in list-2 :");
		n2 = sc.nextInt();
		System.out.println("Enter List - 2 elements : ");
		for(int i = 0 ; i < n2 ; i++) {
			int num = sc.nextInt();
			if(head2 == null)
				head2 = temp = new Node(num);
			else {
				temp.next = new Node(num);
				temp = temp.next;
			}
		}
		Node linkedlist = mergeAndSort(head1,head2);
		print(linkedlist);
		sc.close();
	}
	public static Node mergeAndSort(Node list1,Node list2) {
		List<Integer>li = new ArrayList<>();
		while(list1 != null) {
			li.add(list1.val);
			list1 = list1.next;
		}
		while(list2 != null) {
			li.add(list2.val);
			list2 = list2.next;
		}
		Node temp = null;
		Collections.sort(li);
		Node root = null;
		for(int i = 0 ; i < li.size() ; i++ ) {
			if(root == null)
				root = temp = new Node(li.get(i));
			else {
				temp.next = new Node(li.get(i));
				temp = temp.next;
			}
		}
		return root;
	}
	public static void print(Node head) {
		if(head == null) {
			System.out.println("Empty List...");
			return;
		}
		while(head!=null && head.next != null) {
			System.out.print(head.val+" -> ");
			head = head.next;
		}
		if(head != null)
		System.out.print(head.val+" -> null");
		System.out.println();
	}

}
