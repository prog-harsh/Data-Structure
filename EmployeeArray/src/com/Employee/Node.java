package com.Employee;

public class Node {
    String Name;
    int salary;
    int id;
    String des;
    Node next;
    public Node(String name, int id, int salary, String designation){
        this.Name = name;
        this.salary = salary;
        this.id = id;
        this.des = designation;
        next = null;
    }
}