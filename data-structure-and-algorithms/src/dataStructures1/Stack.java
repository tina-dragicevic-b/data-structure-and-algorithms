package dataStructures1;

import java.util.ArrayList;

public class Stack {
//    int[] array;
    ArrayList<Integer> arrayList;
    int stackSize;
    public Stack(int stackSize){
        this.stackSize = stackSize;
//        this.arrayList = new int[this.stackSize];
        this.arrayList = new ArrayList<>();
    }

    private boolean isFull(){
        return this.arrayList.size() == stackSize;
    }
    private boolean isEmpty(){
        return this.arrayList.isEmpty();
    }
    public void push(int element){
        if(!isFull()){
            this.arrayList.add(element);
        } else {
            System.out.print("Cannot execute method push; stack has reached its max capacity! ");
        }
    }
    public void pop(){
        if(!isEmpty()){
            this.arrayList.remove(this.arrayList.size() - 1);
        } else {
            System.out.print("Cannot execute method pop; stack is empty! ");
        }
    }
    public void print(){
        System.out.println("Stack: " + this.arrayList);
//        this.arrayList.forEach(System.out::println);
    }
}
