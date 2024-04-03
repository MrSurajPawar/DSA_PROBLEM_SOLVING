import java.util.*;

class Stack {
    int top = -1;
    int maxsize = 10;
    int arr[] = new int[maxsize];

    // constructor
    Stack() {
        top = -1;
    }

    // push operation
    boolean push(Scanner sc) {
        if (top == maxsize - 1) {
            System.out.println("Overflow");
            return false;
        } else {
            System.out.println("Enter the element to push :");
            int val = sc.nextInt();
            top++;
            arr[top] = val;
            System.out.println("Item pushed");
            return true;
        }
    }

    // pop operation
    boolean pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return false;
        } else {
            top--;
            System.out.println("Item popped");
            return true;
        }
    }

    // display operation
    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class Stack_Operation {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("*********Stack operations using array*********\n");
        System.out.println("\n------------------------------------------------\n");
        while (choice != 4) {
            System.out.println("\nChose one from the below options...\n");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
            System.out.println("\n Enter your choice \n");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.push(sc);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Please Enter valid choice ");
            }

        }
    }
}
