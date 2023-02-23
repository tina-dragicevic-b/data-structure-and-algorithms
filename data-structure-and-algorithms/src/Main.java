import dataStructures1.Queue;
import dataStructures1.Stack;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Hello world!");
//        System.out.println(args.length);
        final int SIZE = 5;


    // Stack

//        var stack = new Stack(4);
//        stack.push(5);
//        stack.print();
//        stack.push(4);
//        stack.print();
//        stack.push(8);
//        stack.print();
//        stack.push(11);
//        stack.print();
//        stack.push(4);
//        stack.print();
//        stack.pop();
//        stack.print();
//        stack.pop();
//        stack.print();
//        Thread.sleep(3500);


    // Queue
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