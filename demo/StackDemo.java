class ArrayStack{
    private int maxSize;//store maximum no of elements 
    private int size; //stores current size of stack
    private int top;//index of top element 
    private int[] stackArray;//array stack  

    //constructor to initialize values
    public ArrayStack(int userDefinedSize){
        maxSize = userDefinedSize;
        size = 0;
        top = -1; //array index starts at 0
        stackArray = new int[maxSize];
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
        if(!isFull()){//when stack is not full
            top = top + 1;
            stackArray[top] = value;
            System.out.println("Added "+value+" to the top of the stack.");
            // size++;
            size = size + 1;
            return;
            // stackArray[++top] = value;
        }else {//when stack is full
            System.out.println("Stack is full");
            return;
        }
    }

    //pop: int
    public int pop(){
        if(!isEmpty()){//when stack is not empty, remove elements
            int element = stackArray[top];
            top = top - 1;
            size = size - 1;
            return element;
        } else { //when stack is empty
            System.out.println("Stack is empty");
            return -1;
        }
    }

    //peek: int
    public int peek(){
        if(!isEmpty()){//when stack is not empty, remove elements
            int element = stackArray[top];
            return element;
        } else { //when stack is empty
            System.out.println("Stack is empty");
            return -1;
        }
    }

    //size: int
    public int size(){
        return size;
    }
}

class StackDemo{
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack(5);
        System.out.println("Inserting elements into the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Size of the stack: "+stack.size());
        System.out.println("Removing elements from the stack:");
        System.out.println("Removed "+stack.pop()+" from the stack");
        System.out.println("Removed "+stack.pop()+" from the stack");
        System.out.println("Size of the stack: "+stack.size());
        System.out.println("Element at the top: "+stack.peek());
        System.out.println("Is the array empty? "+stack.isEmpty());
        System.out.println("Is the array full? "+stack.isEmpty());
    }
}