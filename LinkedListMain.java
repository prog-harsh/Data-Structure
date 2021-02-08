import java.util.Scanner;

class Node{
	int data;
	Node next;
}
class LinkedList{
	Node head = null;
	public void insert(Node newnode){
		if(head == null){
			head = newnode;
		}
		Node tnode = head;
		while(tnode.next!=null){
			tnode = tnode.next;
		}
		tnode.next = newnode;
		newnode.next = null;
	}
	public void insertAtBegin(Node newnode){
		newnode.next = head;
		head = newnode;
		
	}
	public void deleteAtFront(){
		head = head.next;
		
	}
	public void deleteAtEnd(){
		Node tnode = head;
		Node prev = null;
		while(tnode.next!=null){
			prev = tnode;
			tnode = tnode.next;
		}
		prev.next = null;
		
	}
	public void deleteAtpos(int pos){
		Node tnode = head;
		Node prev = null;
		while(pos>1){
			prev = tnode;
			tnode = tnode.next;
			pos--;
		}
		Node n = tnode.next;
		
		prev.next = prev.next.next;
	}
	public void display(){
		Node tnode = head;
		while(tnode != null){
			System.out.print(tnode.data+" "); 
			tnode = tnode.next;
		}
		System.out.println();
	}

}
class LinkedListMain{
	public static void main(String args[]){
		LinkedList obj = new LinkedList();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			System.out.println("---------Menu Driven Singly LinkedList---------");
			System.out.println("1. Insert at End");
			System.out.println("2. Delete from begining");
			System.out.println("3. Delete from End");
			System.out.println("4. Delete from specific position");
			System.out.println("5. Display");
			System.out.println("6.Exit");
			System.out.print("\nEnter your choice: ");
			int ch = sc.nextInt();
			
			switch(ch){
				case 1:
					System.out.print("Enter Data: ");
					int d = sc.nextInt();
					Node node = new Node();
					node.data = d;
					obj.insertAtBegin(node);
					break;
				case 2:
					obj.deleteAtFront();
					break;
				case 3:
					obj.deleteAtEnd();
					break;
				case 4:
					System.out.print("Enter position: ");
					int pos = sc.nextInt();
					obj.deleteAtpos(pos);
					break;
				case 5:
					obj.display();
					break;
				case 6:
					flag = false;
					break;
				default:
					System.out.print("Invalid Input");
			}
		}
	} 
}
