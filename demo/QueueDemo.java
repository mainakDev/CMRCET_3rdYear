class ArrayQueue{
    private int maxSize;
    private int size;
    private int front;
    private int rear;
    private int[] queueArray;

    public ArrayQueue(int userDefinedSize){
        maxSize = userDefinedSize;
        size = 0;
        rear = -1;
        front = 0;
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
        if(!isFull()){//array is not full
            rear = rear + 1;
            queueArray[rear] = value;
            size = size + 1;
            System.out.println("Entered "+value+" to the queue");
            return;
        } else {//array is full
            System.out.println("The queue is full");
            return;
        }
    }

    //dequeue: int
    public int dequeue(){
        if(!isEmpty()){//if its not empty
            //extract the element
            int element = queueArray[front];
            front = front + 1;
            size = size - 1;
            return element;
        } else {//if its empty
            System.out.println("Queue is empty");
            return -1;
        }
    }

    //peek: int
    public int peek(){
        if(!isEmpty()){//if its not empty
            //extract the element
            int element = queueArray[front];
            return element;
        } else {//if its empty
            System.out.println("Queue is empty");
            return -1;
        }
    }

    //size: int
    public int size(){
        return size;
    }
}

public class QueueDemo{
    public static void main(String[] args){
        ArrayQueue que = new ArrayQueue(5);
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);
        System.out.println("Size of queue:"+que.size());
        System.out.println("Removed element "+que.dequeue()+" from the queue");
        System.out.println("Removed element "+que.dequeue()+" from the queue");
        System.out.println("Size of queue:"+que.size());
        System.out.println("Is queue empty?"+que.isEmpty());
        System.out.println("Is queue full?"+que.isFull());
    }
}