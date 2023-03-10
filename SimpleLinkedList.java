package assignments.LinkedListProblems;

import static java.lang.System.exit;

public class SimpleLinkedList<D> {
    //take variable node
    Node<D> head ;

    Node<D> tail ;

    public void add(D data){
        Node<D> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNextNode(head);
            head = newNode;
        }
    }

    public void display() {
        Node<D> temp = head;
        // check for empty list
        if (head == null) {
            System.out.println("list is empty");
            exit(1);
        } else {
            while (temp != null) {

                // print node data
                System.out.print(temp.getData());

                // assign temp link to temp
                temp = temp.getNextNode();
                if (temp != null)
                    System.out.print(" -> ");
            }
        }
    }
}