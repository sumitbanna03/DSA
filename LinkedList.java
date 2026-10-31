
public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;

    // add first
    public void addFirst(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - newNode next = head
        newNode.next = head; // link

        // step 3 - head = newNode
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - tail next = newNode
        tail.next = newNode; // link

        // step 3 - tail = newNode
        tail = newNode;
    }

    // print linked list
    public void print() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data + " -> null");
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(12);
        ll.addLast(13);
        ll.print();
    }
}
