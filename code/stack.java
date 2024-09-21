class ArrayStack{
    private int maxSize; //stores the maximum possible size of the array
    private int top; // stores the current topmost position in stack
    private int[] stackArray;
    private int size; //stores the current size of the stack

    //constructor to intitialize data memebers
    public ArrayStack(int userDefinedSize){
        maxSize = userDefinedSize;
        top = -1;
        stackArray = new int[maxSize];
        size = 0;
    }

    //isEmpty: boolean
    public boolean isEmpty(){
        return (size == 0);
    }

    //isFull: boolean
    public boolean isFull(){
        return (size == maxSize);
    }

    //push: void
    public void push(int value){
        if(!isFull()){
            stackArray[++top] = value;
            size++;
            System.out.println("Pushed "+value+" to the stack");
        } else {
            System.out.println("Stack is full");
            return;
        }
    }

    //pop: int
    public int pop(){
        if(!isEmpty()){
            int element = stackArray[top--];
            size--;
            return element;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek(){
        if(!isEmpty()){
            int element = stackArray[top--];
            return element;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int size(){
        return size;
    }

}

public class stack{
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack(5);
        System.out.println("Pushing elements to the stack");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Size of stack: "+stack.size());
        System.out.println("Popping elements from the stack");
        System.out.println("Popped "+stack.pop()+" from the stack");
        System.out.println("Popped "+stack.pop()+" from the stack");
        System.out.println("Size of stack: "+stack.size());
        System.out.println("Element at the top: "+stack.peek());
    }
} 