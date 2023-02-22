import dataStructures1.Stack;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.out.println(args.length);

    // Stack
        var stack = new Stack(4);
        stack.push(5);
        stack.print();
        stack.push(4);
        stack.print();
        stack.push(8);
        stack.print();
        stack.push(11);
        stack.print();
        stack.push(4);
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        Thread.sleep(3500);
    }
}