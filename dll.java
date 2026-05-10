package javex;

import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Doublyll {
    Node head;

    Doublyll() {
        head = null;
    }

    // add node at rear
    void addRear(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // DELETE BY VALUE
    void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // case 1: head needs to be deleted
        if (head.data == value) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node current = head;

        // search for the node
        while (current != null && current.data != value) {
            current = current.next;
        }

        // value not found
        if (current == null) {
            System.out.println("Value not found");
            return;
        }

        // case 2 & 3: middle or tail
        if (current.prev != null) {
            current.prev.next = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    // display list
    void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class dll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input example: 1,2,3,4,5
        String s = sc.nextLine();
        String[] sarr = s.split(",");

        Doublyll list = new Doublyll();

        // add elements
        for (int i = 0; i < sarr.length; i++) {
            list.addRear(Integer.parseInt(sarr[i].trim()));
        }

        // value to delete
        int value = sc.nextInt();

        list.deleteByValue(value);
        list.display();
    }
}
