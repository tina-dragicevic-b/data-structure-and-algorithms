package dataStructures1;

import java.util.ArrayList;

public class Queue {
//    Queue always keeps track of the first element/front (does not have to be at index 0) and the last one/rear.
//    FIFO rule
    ArrayList<Integer> queue;
    int SIZE, front, rear;

    public Queue(int size){
        System.out.println("_____QUEUE_____");
        this.SIZE = size;
        this.queue = new ArrayList<>(this.SIZE);
        this.front = this.rear = -1;
    }
    private boolean isFull(){
//        return this.queue.size() == this.SIZE;
        return this.rear == this.SIZE - 1;
    }
    private boolean isEmpty(){
        return this.queue.isEmpty() || this.front == -1;
    }
    public void enqueue(int element){
        if(!isFull()){
            this.queue.add(element);
            if(this.front >= 0){
                this.rear++;
            } else {
                this.front = 0;
                this.rear = 0;
            }
        } else {
            if(this.rear == this.SIZE - 1 && this.front > 0){
                //(this.rear - this.front < this.SIZE - 1)
                // move all elements one position left and place new element at the end
                var tempQueue = new ArrayList<Integer>();
                for(int i = 0; i < this.rear; i++){
                    if(i < this.front - 1){
                        tempQueue.add(0);
                    } else tempQueue.add(i, this.queue.get(i + 1));
                }
                System.out.println("tempQueue " + tempQueue);
                this.queue = tempQueue;
                this.front--;
//                this.rear--;
                this.queue.add(element);
            } else System.out.println("Queue is full. ");
        }
    }

    public void dequeue(){
        // eject the first element inserted (at index 0)
        if(!isEmpty()){
            var ejected = this.queue.get(this.front);
            if(this.front == this.rear){
                this.front = this.rear = -1;
                System.out.println("Deleted element is: " + ejected);
                System.out.println("All queue elements are deleted.");
            } else {
                this.front++;
            }
        } else {
            System.out.println("Queue is empty. ");
        }
    }
    public void print(){
        System.out.println("Position of front: " + this.front + ", and rear: " + this.rear);
        for(int i = this.front; i <= this.rear; i++){
            System.out.print(queue.get(i) + " ");
        }
//        System.out.println(this.queue);
        System.out.println();
    }
    public static void mainQueue(int SIZE){
        var que = new Queue(SIZE);
        que.dequeue();
        que.enqueue(5);
        que.enqueue(2);
        que.enqueue(45);
        que.enqueue(5);
        que.enqueue(61);
        que.print();
        que.enqueue(28);
        que.dequeue();
        que.dequeue();
        que.print();
        que.enqueue(28);
        que.print();
        que.enqueue(57);
        que.print();
        que.enqueue(28);
        que.print();
    }
}
