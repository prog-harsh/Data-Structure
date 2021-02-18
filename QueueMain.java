import java.util.Scanner;

class Queue {
	int front;
	int size;
	int rear;
	int arr[];
	public Queue(int size){
		front = -1;
		rear = -1;
		this.size = size;
		arr = new int[size];
	}
	public void peek(){
		if (!isEmpty()) {
			System.out.println("Peek Data ==>");
			System.out.println(arr[front]);
		}
		else {
			System.out.println("Underflow");
		}
	}
	public void enqueue(int data){
		if (!isFull()) {
			arr[rear+1] = data;
			rear++;
		}
		else {
			System.out.println("Overflow");
		}
		if(front == -1){
			front = 0;
		}
	}
	public void dequeue(){
		if (!isEmpty()) {
			//arr[front+1] = 0;
			front++;
		}
		else{
			System.out.println("Underflow");
		}
		if(front>rear){
			front = rear = -1;
		}
	}
	public boolean isEmpty(){
		return (front==-1);
	}
	public  boolean isFull(){
		return (rear==size-1);
	}
	public void display(){
		if (!isEmpty()) {
			int temp = front;
			System.out.println("Data in the Queue ==>");
			while(temp != rear+1){
				System.out.print(arr[temp]+" ");
				temp++;
			}
			System.out.println();
		}
		else{
			System.out.println("Underflow");
		}
	}
}
class QueueMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Queue: ");
		int size = sc.nextInt();
		Queue queue = new Queue(size);
		while(true){
			System.out.println("-----------------Queue Data Structure-----------------\n\n");
			System.out.println("1. Add Data");
			System.out.println("2. Delete Data");
			System.out.println("3. Display");
			System.out.println("4. Show peek Data");
			System.out.println("5. Exit\n");
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();

			switch (ch) {
				case 1:
					System.out.println("Enter your Data: ");
					int data = sc.nextInt();
					queue.enqueue(data);
						break;
				case 2:
					queue.dequeue();
					break;
				case 3:
					queue.display();
					break;
				case 4:
					queue.peek();
					break;
				case 5:
					return;
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}
