package dataStructures2;

public class LinkedList {
    public Node head;

    public LinkedList(){
        System.out.println("_____LINKED LIST_____");
    }
    static class Node{
        // static class allows us to create instance of Node without creating the LinkedList one
        // which will be used for inserting new Node into an existing LinkedList.
        public int data;
        public Node nextNode;
        public Node(int data){
            this.data = data;
            this.nextNode = null;
        }
    }

    //  INSERTION
    private void insertAtTheBeginnig(int newData){
        var newNode = new Node(newData);
        if(this.head == null){
            this.head = newNode;
        } else {
            newNode.nextNode = this.head;
            this.head = newNode;
        }
    }
    private void insertAtTHeEnd(int newData){
        var newNode = new Node(newData);
        if(this.head == null){
            this.head = newNode;
        } else {
            var temp = this.head;
            while (temp.nextNode != null){
                temp = temp.nextNode;
            } temp.nextNode = newNode;
        }
    }
    private void insertInTheMiddle(int newData, int position){
        var newNode = new Node(newData);
        var temp = this.head;
        for(int i = 0; i < position; i++){
            if(temp == null) {
                System.out.println("Index out of the range. ");
                return;
            }
            if(i == position - 1){
                newNode.nextNode = temp.nextNode;
                temp.nextNode = newNode;
                return;
            }
            temp = temp.nextNode;
        }
    }
    //  DELETION
    private void deleteFromTheBegining(){
        if(this.head == null){
            System.out.println("List is already empty. ");
            return;
        }
        this.head = this.head.nextNode;
    }
    private void deleteFromTheEnd(){
        if(this.head == null){
            System.out.println("List is already empty. ");
            return;
        }
        var temp = this.head;
        while (temp.nextNode != null){
            if(temp.nextNode.nextNode == null){
                temp.nextNode = null;
                break;
            }
            temp = temp.nextNode;
        }
    }
    private void deleteFromTheMiddle(int position){
        var temp = this.head;
        for(int i = 0; i < position; i++){
            if(temp == null) {
                System.out.println("Index out of the range. ");
                return;
            }
            if(i == position - 1){
                temp.nextNode = temp.nextNode == null ? null : temp.nextNode.nextNode;
                return;
            }
            temp = temp.nextNode;
        }
    }
    private void print(){
        if(this.head != null){
            var temp = this.head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.nextNode;
            }
            System.out.println();
        } else System.out.println("List is empty. ");
    }
    public static void mainLinkedList(){
        var linkedList = new LinkedList();
        linkedList.insertInTheMiddle(237, 2);
        linkedList.print();
        linkedList.insertAtTheBeginnig(255);
        linkedList.insertAtTheBeginnig(297);
        linkedList.print();
        linkedList.insertAtTHeEnd(199);
        linkedList.print();
        linkedList.insertAtTHeEnd(411);
        linkedList.print();
        linkedList.insertAtTheBeginnig(313);
        linkedList.print();
        linkedList.insertInTheMiddle(237, 7);
        linkedList.insertInTheMiddle(237, 2);
        linkedList.print();
        linkedList.deleteFromTheMiddle(6);
        linkedList.deleteFromTheMiddle(5);
        linkedList.print();
        linkedList.deleteFromTheMiddle(3);
        linkedList.print();
        linkedList.deleteFromTheBegining();
        linkedList.print();
        linkedList.deleteFromTheEnd();
        linkedList.print();
    }
}
