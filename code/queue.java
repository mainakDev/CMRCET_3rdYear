class ArrayQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int size;
    private int[] queueArray;

    public ArrayQueue(int userDefinedSize){
        maxSize = userDefinedSize;
        front = 0;
        rear = -1;
        size = 0;
        queueArray = new int[maxSize];
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
    public void enqueue(int value){
        if(!isFull()){
            queueArray[++rear] = value;
            size++;
            System.out.println("Enqueued "+value+" to the queue");
            return;
        } else {
            System.out.println("Queue is full");
            return;
        }
    }

    //dequeue: int
    public int dequeue(){
        if(!isEmpty()){
            int element = queueArray[front++];
            size--;
            return element;
        } else {
            System.out.println("The queue is empty");
            return -1;
        }
    }

    //peek: int
    public int peek(){
        if(!isEmpty()){
            int element = queueArray[front];
            return element;
        } else {
            System.out.println("The queue is empty");
            return -1;
        }
    }

    //size: int
    public int size(){
        return size;
    }
}

public class queue{
    public static void main(String[] args){
        ArrayQueue que = new ArrayQueue(5);
        System.out.println("Inserting elements into the queue");
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);
        System.out.println("Size of queue: "+que.size());
        System.out.println("Removing elements from the queue");
        System.out.println("Removed element "+que.dequeue()+" from the queue");
        System.out.println("Removed element "+que.dequeue()+" from the queue");
        System.out.println("Size of queue: "+que.size());
        System.out.println("Element at the front: "+que.peek());
    }
}