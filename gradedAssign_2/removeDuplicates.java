package assignmentHV.gradedAssign_2;
import java.util.*;
public class removeDuplicates {
	static class Node{
		int val;
		Node next = null;
		Node(int val){
			this.val = val;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements :");
		int n = sc.nextInt();
		Node head = null;
		Node temp = null;
		/*2->5->12->2->3->5->1->2->5->5*/
		System.out.println("Enter elemnts : ");
		for(int i = 0 ; i < n ; i++) {
			int num = sc.nextInt();
			if(head == null)
				head = temp = new Node(num);
			else {
				temp.next = new Node(num);
				temp = temp.next;
			}
		}
		head = removeDuplicatesList(head);
		print(head);
		sc.close();
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
	public static Node removeDuplicatesList(Node head) {
		Node root = null;
		Node temp = null;
		Map<Integer,Integer>mp = new HashMap<>();
		while(head!=null) {
			int n = head.val;
			if(!mp.containsKey(n)) {
				if(root == null)
					root = temp = new Node(n);
				else {
					temp.next = new Node(n);
					temp = temp.next;
				}
				mp.put(n, 1);
			}
			head = head.next;
		}
		return root;
	}
}
