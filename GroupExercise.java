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
        

    }
}