package com.Employee;
import java.util.Scanner;
public class EmpMain {
    Node head;
    Node tail;
    Employee[] arr;
    int size;
    public EmpMain(int size){
        arr = new Employee[size];
        this.size = size;
        this.tail = null;
        this.head = null;
    }
    public void addInArray(Employee data,int i) {
            arr[i] = data;
    }
    public void insertInLinkedList(){
        //sortArray();
        for (int i = 0; i < size; i++) {
            Node newnode = new Node(arr[i].getEmpname(),arr[i].getEmpid(),arr[i].getEmpsalary(),arr[i].getDesignation());
            if (head == null || newnode.salary <= head.salary) {
                newnode.next = head;
                head = newnode;
            } else {
                Node temp =head;
                while(temp.next != null && newnode.salary >= temp.next.salary){
                    temp = temp.next;
                }
                newnode.next = temp.next;
                temp.next = newnode;

            }
        }
    }
    public void display(){
        if(head == null && tail == null){
            System.out.println("Empty");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.println(temp.Name+" "+temp.id+" "+temp.des+" "+temp.salary);
                temp = temp.next;
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        EmpMain obj = new EmpMain(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Your Name");
            String name = sc.next();
            System.out.println("Enter Employee Id");
            int id = sc.nextInt();
            System.out.println("Enter Employee Salary");
            int sal = sc.nextInt();
            System.out.println("Enter Employee Designation");
            String des = sc.next();
            Employee emp = new Employee(name, id, sal, des);
            obj.addInArray(emp,i);
        }
        obj.insertInLinkedList();
        obj.display();
    }
}
