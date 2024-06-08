package task4;

import java.util.Stack;

public class IntegerStack {

	// Stack to store integers
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(int element) {
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack.");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println("Popped " + element + " from the stack.");
            return element;
        } else {
            System.out.println("Stack is empty. Cannot pop an element.");
            return -1;  // Indicating stack is empty
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        boolean empty = stack.isEmpty();
        if (empty) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
        return empty;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntegerStack integerStack = new IntegerStack();

        // Pushing elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Checking if the stack is empty
        integerStack.isEmpty();

        // Popping elements from the stack
        integerStack.pop();
        integerStack.pop();
        integerStack.pop();

        // Checking if the stack is empty again
        integerStack.isEmpty();

        // Trying to pop from an empty stack
        integerStack.pop();
    }

		
		
	}


