package LearningModule;

class Node5 {
    int data;
    Node5 next;

    public Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList2 {
    Node5 head;

    public CustomLinkedList2() {
        this.head = null;
    }

    public void append(int data) {
        Node5 newNode = new Node5(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node5 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void reverse() {
        Node5 prev = null;
        Node5 current = head;
        Node5 next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display() {
        Node5 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListExample3 {

    public static void main(String[] args) {
        CustomLinkedList2 linkedList = new CustomLinkedList2();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        System.out.println("Linked List Values: ");
        linkedList.display();
        
        System.out.println("Reversed Linked List Values: ");
        linkedList.reverse();
        linkedList.display();
    }
}
