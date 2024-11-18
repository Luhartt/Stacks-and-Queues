import java.util.Scanner;

public class stacks {
    public static int[] stack;
    public static int top = -1; 
    public static int stackSize;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("STACKS");

        System.out.print("Enter stack size: ");
        stackSize = s.nextInt();
        stack = new int[stackSize];

        while (true) {
            System.out.println("\n[A]Push | [B]Pop | [C]IsEmpty | [D]IsFull | [E]Peek | [F]Display [X]Exit");
            System.out.print("Choose option: ");
            String option = s.next().toUpperCase();

            switch (option) {
                case "A":
                    push();
                    break;
                case "B":
                    pop();
                    break;
                case "C":
                    isEmpty();
                    break;
                case "D":
                    isFull();
                    break;
                case "E":
                    peek();
                    break;
                case "F":
                    display();
                    break;
                case "X":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    static void push() {
        Scanner s = new Scanner(System.in);
        if (top == stackSize - 1) { // MEANING LANG NITO IS CHECK KUNG FULL 
            System.out.println("Stack is full. Cannot push.");
        } else {
            System.out.print("Enter value to push: ");
            int value = s.nextInt();
            stack[++top] = value; // INCREMENT TOP and ADD VALUE
            System.out.println("Pushed: " + value);
        }
    }

    static void pop() {
        if (top == -1) { // ETO NAMAN CHECK KUNG EMPTY
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            int value = stack[top--]; // GET VALUE and DECREMENT TOP
            System.out.println("Popped: " + value);
        }
    }

    static void isEmpty() {
        if (top == -1) {  
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }

    static void isFull() {
        if (top == stackSize - 1) { 
            System.out.println("Stack is full.");
        } else {
            System.out.println("Stack is not full.");
        }
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot peek.");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) { 
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}