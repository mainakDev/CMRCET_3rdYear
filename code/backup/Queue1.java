class ArrayQueue{
    private int front; //front pointer for array
    private int maxSize; //max size of queue array
    private int rear; //rear pointer for array
    private int size; //keeping track of the size
    private int[] arrQue; //array to store the queue

    public ArrayQueue(int userDefinedSize){
        maxSize = userDefinedSize;
        front = 0;
        rear = -1;
        size = 0;
        arrQue = new int[maxSize];
    }

    //isEmpty: boolean
    public boolean isEmpty(){
        return (size == 0);
    }

    //isFull: boolean
    public boolean isFull(){
        return (size == maxSize);
    }

    //enqueue: void
    //inserting new elements to the queue
    public void enqueue(int value){
        if(!isFull()){
            rear++;
            arrQue[rear] = value;
            size++;
            System.out.println("Enqueue new element: "+value);
        } else {
            System.out.println("Quueue is full");
            return;
        }
    }

    //dequeue: int
    //deleting elements from the queue
    public int dequeue(){
        if(!isEmpty()){
            int element = arrQue[front];
            front++;
            size--;
            System.out.println("Removed element from the queue");
            return element;
        } else{
            System.out.println("Queue is empty");
            return -1;
        }
            
    }

}

public class Queue1{
    public static void main(String[] args){
        ArrayQueue que = new ArrayQueue(5);
        System.out.println("Queuing new elements to the queue");
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);
        System.out.println("Dequeuing elements from the queue");
        System.out.println("Removed "+que.dequeue()+" from the queue");
        System.out.println(que.isEmpty());
        System.out.println(que.isFull());
    }

}