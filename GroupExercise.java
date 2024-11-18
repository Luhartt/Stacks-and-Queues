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

    private int[] givenArray;
    private int NumberOfElements = 0;
    private Boolean EnqueueEnabled = true;
    private int LeftIndex = 0; //Right pointer (front)
    private int RightIndex = 0; //left pointer (rear)
    

    public Queues(int[] arr) {
        this.givenArray = arr;
        this.NumberOfElements = arr.length;
    }

    public int Peek(){
         return this.LeftIndex  == this.NumberOfElements ? -1 : this.givenArray[this.LeftIndex];
    } 

    public void Enqueue(int x){
        if(this.EnqueueEnabled){
            this.givenArray[this.RightIndex] = x;
            this.RightIndex++;
            DisplayElements();
        }

        if(this.RightIndex == this.NumberOfElements){
            EnqueueEnabled = false;
        }

        if (this.isEmpty()){
            EnqueueEnabled = true;
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