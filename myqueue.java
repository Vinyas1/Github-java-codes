package javex;
import java.util.*;

class Queue {
    int[] queue;
    int front;
    int rear;
    int size;

     public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            queue[++rear] = value;
        }
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue underflow");
        } else {
            int removed = queue[front++];
            System.out.println("Removed: " + removed);
        }
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}

public class myqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();    
        Queue q = new Queue(size);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();
        q.display();
    }
}
