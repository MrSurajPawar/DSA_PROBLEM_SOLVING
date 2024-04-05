import java.util.*;

class Queue {
    int front;
    int rear;
    int maxsize = 10;
    int arr[] = new int[maxsize];

    // constructor
    Queue() {
        front = -1;
        rear = -1;
    }

    // enqueue operation
    boolean enqueue(Scanner sc) {
        if (rear == maxsize - 1) {
            System.out.println("Overflow");
            return false;
        } else {
            System.out.println("Enter the value :");
            int item = sc.nextInt();

            if (front == -1 && rear == -1) {
                front = rear = 0;
            } else {
                rear = rear + 1;
            }

            arr[rear] = item;
            System.out.println("Item enqueued");
            return true;
        }
    }

    // dequeue operation
    boolean dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
            return false;
        } else {
            if (front == rear) {
                front = rear = -1;
            } else {
                front = front + 1;
            }
            return true;
        }
    }

    // display
    void display() {
        if (rear == -1)
            System.out.println("Queue is empty.");
        else {
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }

}

public class QueueOperation {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        System.out.println("\n*************************Main Menu*****************************\n");
        System.out.println("\n=================================================================\n");
        while (choice != 4) {
            System.out.println("\n1.insert an element\n2.Delete an element\n3.Display the queue\n4.Exit\n");
            System.out.print("\nEnter your choice ?");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    q.enqueue(sc);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter valid choice ");
            }
        }
    }
}
