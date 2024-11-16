import java.io.*;
import java.util.Scanner;

class GroupExercise {

    public class Stacks {
        public int[] givenArray;


        public Stacks(int[] arr) {

        }

        public void Push(int x) {

        }

        public int Pop() {
            return 0;
        }

        public int Peek() {
            return 0;
        }

        public boolean isEmpty() {
            return false;
        }

        public boolean isFull() {
            return false;
        }

        public void displayStack() {
            System.out.print("Current Elements: ");
            for (int i : givenArray) {
                System.out.print(i + " ");
            }
        }
        

    }

    public void Dequeue(){

        //left index ++
    }

    public boolean isEmpty(){
        return false;
        //this.rightIndex == 0 ulit pag nag true na
    }

    public boolean isFull (){
        return false;
    }
    public int Poll(){

        int Poll = this.LeftIndex == this.NumberOfElements ? -1 : this.givenArray[this.LeftIndex];
        this.givenArray[this.LeftIndex] = 0;
        this.LeftIndex += 1;
        DisplayElements();
        return Poll;
    }

    public void DisplayElements(){
        for (int i : this.givenArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}


    
    public static void main(String[] args) throws IOException{
    // GroupExercise exercise = new GroupExercise();
    // Queues queues = exercise.new Queues(new int[5]);  

    Scanner sc = new Scanner(System.in);

    System.out.print("""
    Basic Stack and Queue Operations

    [S] Stack
    [Q] Queue
    [X] Exit

    Enter the data structure you want to use: 
    """);

    char userResponse = sc.next().toUpperCase().charAt(0);

    String prompt = """
    Methods
    [A] Push: Add an element to the top of a stack
    [B] Pop: Remove an element from the top of a stack
    [C] IsEmpty: Check if the stack is empty
    [D] IsFull: Check if the stack is full
    [E] Peek: Get the value of the top element without removing it
    [X] Exit
            """;

    switch (userResponse) {
        case 'S':
            System.out.println("Stack\n\n" + prompt);
            break;

        case 'Q':
            System.out.println("Queue\n\n" + prompt);
            break;

        case 'X':
            System.exit(0);
            break;

        default:
            break;
    }

    sc.close();
    
    }
}