import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class stacks {
    List<Integer> stackList;
    public int top = -1; 
    public int stackSize;

    public stacks(Integer[] stack, int stackSize) {
        this.stackList = Arrays.asList(stack);
        this.stackSize = stackSize;
    }

    public void push(int value) {
        if (top == stackSize - 1) { // MEANING LANG NITO IS CHECK KUNG FULL 
            System.out.println("Overflow!!");
            DisplayElements();
        } else {
            System.out.print("Enter value to push: ");
            stackList.set(++top, value);
            System.out.println("Pushed: " + value);
            DisplayElements();
        }
    }

    public void pop() {
        if (top == -1) { // ETO NAMAN CHECK KUNG EMPTY
            System.out.println("Underflow!!");
            DisplayElements();
        } else {
            int value = stackList.get(top);
            stackList.set(top, null);
            top--;
            // GET VALUE and DECREMENT TOP
            System.out.println("Popped: " + value);
            DisplayElements();
        }
    }

    public boolean isEmpty() {
        if (top == -1) {  
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == stackSize - 1) { 
            return true;
        } else {
            return false;
        }
    }

    public int peek() {
        if (top == -1) {
            return 0;
        } else {
            return stackList.get(top);
        }
    }

    public void DisplayElements() {
        System.out.println("Elements: ");
        for (int i = stackSize-1; i >= 0; i--) {
            if(stackList.get(i) == null) continue;
            System.out.println(stackList.get(i));
        }

        System.out.println();
    }
}