import java.io.*;
import java.util.Scanner;

class GroupExercise {

    public class Stacks {
        public int[] givenArray;

        public Stacks(int[] arr) {
            this.givenArray = arr;
        }


    }


    public class Queues {

        public int[] givenArray;
        public int NumberOfElements;

        public Queues(int[] arr) {
            this.givenArray = arr;
            this.NumberOfElements = arr.length;
        }

        public int Peek(){
            return this.givenArray[0];
        } 

        public void Enqueue(){

        }

        public boolean isEmpty(){
            return false;
        }

        public boolean isFull (){
            return false;
        }
        public int Poll(){
            return 0;
        }

    }
    public static void main(String[] args) throws IOException{
        
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