import java.util.Scanner;

class Employee{
	String firstname;
	String lastname;
	int id;
	int sal;
	String type;
	public Employee(String firstname, String lastname, int id, int sal, String type){
		this.firstname = firstname;
		this.lastname = lastname;
		this. id = id;
		this.sal = sal;
		this.type = type;
	}
}
class Node{
	Employee data;
	Node next;
	public Node(Employee data){
		this.data = data;
		next = null;
	}
}
class Queue{
	Node head;
	Node tail;
	public Queue(){
		head = tail = null;
	}
	public void enqueue(Employee data){
		Node newnode = new Node(data);
		if(head == null && tail == null){
			head = newnode;
			tail = newnode;
		}
		else{
			newnode.next = head;
			head = newnode;
		}
	}
	public void dequeueFront(){
		if(head == null && tail == null){
			System.out.println("Empty");
			return;
		}
		head = head.next;
		
	}
	public void dequeueEnd(){
		if(head == null && tail == null){
			System.out.println("Empty");
			return;
		}
		Node temp = head;
		Node prev = null;
		while(temp.next != null){
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}
	public void display(){
		if(head == null && tail == null){
			System.out.println("Empty");
		}
		else{
			Node temp = head;
			while(temp != null){
				System.out.println("Name : "+temp.data.firstname+" "+temp.data.lastname);
				System.out.println("ID : "+temp.data.id);
				System.out.println("Salary : "+temp.data.sal);
				System.out.println("Type : "+temp.data.type);
				System.out.println("---------------------------");
				temp = temp.next;
			}
		}
	}
}
class EmployeeMain{
	public static void main(String args[]){
		Queue obj = new Queue();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1. Add Employee");
			System.out.println("2. Remove Employee from front");
			System.out.println("3. Remove Employee from end");
			System.out.println("3. Remove Employee from ID");
			System.out.println("4. Remove All");
			System.out.println("5. Display");
			System.out.println("6. Exit");
			System.out.println("\nEnter your choice ");
			int ch = sc.nextInt();
			
			switch(ch){
				case 1:
					System.out.println("Enter first name");
					String firstname = sc.next();
					System.out.println("Enter last name");
					String lastname = sc.next();
					System.out.println("Enter Id No.");
					int id = sc.nextInt();
					System.out.println("Enter Salary");
					int sal = sc.nextInt();
					System.out.println("Enter type(temp/daily)");
					String type = sc.next();
					
					Employee data = new Employee(firstname,lastname,id,sal,type);
					obj.enqueue(data);
					break;
				case 2:
					obj.dequeueFront();
					break;
				case 3:
					obj.dequeueEnd();
					break;
				case 5:
					obj.display();
					break;
				case 6:
					return;
					
			}
		}
	}
}
