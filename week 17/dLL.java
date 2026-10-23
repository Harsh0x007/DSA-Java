
public class dLL {
    class DoublyNode {
        int val;
        DoublyNode next;
        DoublyNode prev;
        DoublyNode(int val) {
            this.val = val;
        }
    }

    DoublyNode head;
    DoublyNode tail;
    int size;

    void insertAtHead(int val) {
        DoublyNode temp = new DoublyNode(val);
        if(head == null || tail == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val) {
        if( head == null) {
            insertAtHead(val);
        } else {
            DoublyNode temp = new DoublyNode(val);
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void deletAtHead() {
        if(head == null) {
            System.out.println("No Node to be deleted");
            return;
        }
        head = head.next;
        head.prev =  null;
        size--;
    } 

    void display() {
        DoublyNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        dLL list = new dLL();
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);
        list.display();
        list.deletAtHead(); list.display();

    }
}
