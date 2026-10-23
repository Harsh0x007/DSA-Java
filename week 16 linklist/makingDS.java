public class makingDS {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10); //0
        ll.addAtTail(20); //1
        ll.displayList();
        
        System.out.println();
        System.out.println(ll.size);
        ll.deleteAtPosi(1); ll.displayList();
        System.out.println();
        System.out.println(ll.size);
        
    }
}
class Node{
    int val;
    Node next;

    Node(int data) {
        this.val = data;
        this.next = null;
    }
}

class Linkedlist{
    Node head; 
    Node tail;
    int size;

    void deleteAtPosi(int idx) {
        if(head == null) {
            if(idx == 0) {
                System.out.println("Linkedlist is empty");
            }
            return;
        }
        if(idx == 0) {
            head = head.next;
            if(head == null) {
                tail = null;
            }
            size--;
            return;
        }
        Node temp = head;
        int count = 0;

        while(temp != null && temp.next != null){
            if(count == idx -1) {
                if(temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp= temp.next;
            count++;
        }


    }

    void insertAtPosi(int idx, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            if(idx == 0) {
                head = tail = newNode;
            } else {
                System.out.println("Index out of bounds!");
            }
            return;
        }
        if(idx == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int count = 0;

        while(temp != null) {
            if(count == idx -1) {
                newNode.next = temp.next;
                temp.next = newNode;
                
                if(newNode.next == null) {
                    tail = newNode;
                }
                return;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("Index out of bounds!");
    }

    int searchPosi(int data) {
        Node temp = head;
        if(head == null) return -1;
        int count = 0;
        while(temp != null) {
            if(temp.val == data) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    boolean searchElm(int data) {
        Node temp = head;
        if(head == null) return false;
        
        if(tail.val == data) return true;
            
        while(temp != null) {
            if(temp.val == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void addAtTail(int data) {
        Node temp = new Node(data);
        if(tail == null) {
            head = tail = temp;
            size++;
            return;
        }
        tail.next = temp;
        tail = temp;
        size++;
    }

    void addAtHead(int data) {
        Node temp = new Node(data);
        if(head == null) {
            head = tail = temp;
            return;
        }
        temp.next = head;
        head = temp;
        size++;
    }

    void deleteAtHead() {
        if(head == null) {
            System.out.print("No element to delete!");
            return;
        }
        if(head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        size--;
    }

    void deleteAtTail() {
        if(head == null) {
            System.out.print("No element to delete!");
            return;
        }
        if(head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    void displayList() {
        if(head == null) {
            System.out.print("null");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

