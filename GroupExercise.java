import java.io.*;
import java.util.Scanner;

class GroupExercise {

    public class Stacks {
        private int[] givenArray;

        public Stacks(int[] arr) {
            this.givenArray = arr;
        }

        // Methods here
    }

    public class Queues {

        private int[] givenArray;
        private int NumberOfElements = 0;
        private int LeftIndex = 0; // Right pointer (front)
        private int RightIndex = 0; // left pointer (rear)

        public Queues(int[] arr) {
            this.givenArray = arr;
            this.NumberOfElements = arr.length;
        }

        public int Peek() {
            return this.LeftIndex == this.NumberOfElements ? -1 : this.givenArray[this.LeftIndex];
        }

        public void Enqueue(int x) {
            if (this.isFull()) {
                System.out.println("Overflow!");
            } else { // Performs enqueue if the queue is not full
                this.givenArray[this.RightIndex] = x;
                this.RightIndex++;
                DisplayElements();
            }
        }

        public void Dequeue() {
            if (this.isEmpty()) {
                System.out.println("Underflow!");
            } else { // Performs dequeue if the queue is not empty
                this.givenArray[this.LeftIndex] = 0;
                this.LeftIndex += 1;
                DisplayElements();

                if (this.LeftIndex == this.RightIndex) { // Resets pointers position once the queue is empty
                    this.LeftIndex = 0;
                    this.RightIndex = 0;
                }
            }
        }

        public boolean isEmpty() {
            return this.LeftIndex == this.RightIndex;
        }

        public boolean isFull() {
            return this.RightIndex == this.NumberOfElements;
        }

        public void DisplayElements() {
            for (int i : this.givenArray) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public class Prompts {

        public static String getOperationsPrompt(char x) {
            if (x == 'S') {
                return """
                        \nStack Operations
                        [A] Push: Add an element to the top of a stack
                        [B] Pop: Remove an element from the top of a stack
                        [C] IsEmpty: Check if the stack is empty
                        [D] IsFull: Check if the stack is full
                        [E] Peek: Get the value of the top element without removing it

                        [X] Back to Menu

                        Enter the operation: """ + " ";
            } else if (x == 'Q') {
                return """
                        \nQueue Operations
                        [A] Enqueue: Add an element to the rear of the queue
                        [B] Dequeue: Remove an element from the front of the queue
                        [C] IsEmpty: Check if the queue is empty
                        [D] IsFull: Check if the queue is full
                        [E] Peek: Get the value of the front element without removing it

                        [X] Back to Menu

                        Enter the operation: """ + " ";
            }

            return "\nInvalid input";
        }

        public static void StackOperations(Stacks stack, Scanner scanner) {
            char operation;

            do {
                System.out.print(getOperationsPrompt('S'));
                operation = scanner.next().toUpperCase().charAt(0);
                scanner.nextLine();

                switch (operation) {
                    case 'A':
                        // System.out.print("Enter value to Push: ");
                        // stack.Push(scanner.nextInt());
                        // scanner.nextLine();
                        break;

                    case 'B':
                        // stack.Pop();
                        break;

                    case 'C':
                        // String promptIsEmpty = stack.isEmpty() == true ? "empty." : "not empty.";
                        // System.out.print("Stack is " + promptIsEmpty + "\n");
                        break;

                    case 'D':
                        // String promptIsFull = stack.isFull() == true ? "full." : "not full.";
                        // System.out.print("Stack is " + promptIsFull + "\n");
                        break;

                    case 'E':
                        // if (stack.isEmpty()) {
                        //     System.out.println("Stack is empty.");
                        // } else {
                        //     System.out.println("Element at top:  " + stack.Peek() + "\n");
                        // }
                        break;

                    case 'X':
                        return;

                    default:
                        System.out.println("Invalid Input.");
                        break;
                }
            } while (operation != 'X');
        }

        public static void QueueOperations(Queues queue, Scanner scanner) {
            char operation;

            do {
                System.out.print(getOperationsPrompt('Q'));
                operation = scanner.next().toUpperCase().charAt(0);
                scanner.nextLine();

                switch (operation) {
                    case 'A':
                        System.out.print("Enter value to enqueue: ");
                        queue.Enqueue(scanner.nextInt());
                        scanner.nextLine();
                        break;

                    case 'B':
                        queue.Dequeue();
                        break;

                    case 'C':
                        String promptIsEmpty = queue.isEmpty() == true ? "empty." : "not empty.";
                        System.out.print("Queue is " + promptIsEmpty + "\n");
                        break;

                    case 'D':
                        String promptIsFull = queue.isFull() == true ? "full." : "not full.";
                        System.out.print("Queue is " + promptIsFull + "\n");
                        break;

                    case 'E':
                        if (queue.isEmpty()) {
                            System.out.println("Queue is empty.");
                        } else {
                            System.out.println("Element at front:  " + queue.Peek() + "\n");
                        }
                        break;

                    case 'X':
                        return;

                    default:
                        System.out.println("Invalid Input.");
                        break;
                }
            } while (operation != 'X');
        }
    }

    public static void main(String[] args) throws IOException {
        GroupExercise exercise = new GroupExercise();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine();

        do {
            System.out.print("""
                    Basic Stack and Queue Operations

                    [S] Stack
                    [Q] Queue
                    [X] Exit

                    Enter the data structure you want to use:  """ + " ");

            char userResponse = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

            switch (userResponse) {
                case 'S':
                    // Stacks stack = exercise.new Stacks(new int[arraySize]);
                    // Prompts.StackOperations(stack, scanner);
                    break;

                case 'Q':
                    Queues queue = exercise.new Queues(new int[arraySize]);
                    Prompts.QueueOperations(queue, scanner);
                    break;

                case 'X':
                    System.out.println("\nApplication exited.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println(Prompts.getOperationsPrompt(userResponse));
                    break;
            }
        } while (true);
    }
}