//implementing stack using an array
class StackArray{
    private int maxSize;
    private int[] stackArray;
    private int top;

    //constructor
    public StackArray(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;//indicates stack is empty
    }

    public void push(int value){
        if(top < maxSize - 1){//stack is not full
            stackArray[++top] = value;
        } else {//stack is full
            System.out.println("Stack is full");
        }
    }

    public int pop(){
        //check for the top element and return & remove it
        if (top > 0){ //meaning there is an element in the stack
            return stackArray[top--];
        } else{//stack is empty
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek(){
        if(top >= 0){//meaning element is available
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty(){
        return (top == -1) ;
    }

    public int size(){
        return top+1;
        // return stackArray.length;
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }
}

public class stack{
    public static void main(String[] args){
        StackArray stack = new StackArray(5);

        //push operation
        System.out.println("Pushing elements into the stack");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        //peek operation
        System.out.println("Top element of the stack:"+stack.peek());
        
        //pop operation
        System.out.println("Removing top element from the stack:");
        System.out.println("Popped:"+stack.pop());
        System.out.println("Popped:"+stack.pop());

        //isEmpty operation
        System.out.println("Checking if the stack is empty:"+stack.isEmpty());

        //isFull operation
        System.out.println("Checking if the stack is full:"+stack.isFull());

        //size operation
        System.out.println("Checking current size of the stack:"+stack.size());
    }
}