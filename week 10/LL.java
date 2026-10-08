public class LL {

    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        
        if(head == null) {
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;
    }

    public void deleteFirst() {
        if( head == null) {
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.print("The list is empty");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }
        

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void displayList() {
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    } 

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.displayList();

        list.deleteFirst();
        list.displayList();


    }
}
