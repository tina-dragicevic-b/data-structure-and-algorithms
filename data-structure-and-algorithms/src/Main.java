import dataStructures1.Queue;
import dataStructures1.Stack;
import dataStructures2.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(args.length);
        final int SIZE = 5;

        Stack.mainStack();
        Thread.sleep(3500);
        Queue.mainQueue(SIZE);
        Thread.sleep(3500);
        LinkedList.mainLinkedList();
    }
}