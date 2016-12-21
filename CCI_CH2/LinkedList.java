class LinkedList{
    Node head = new Node(0);

    LinkedList(int d){
        head.next = new Node(d);
    }

    LinkedList(){}

    public class Node{
        Node next = null;
        int data;

        Node(int d){
            data = d;
        }
    }
    Node endNode(){
        Node n = head;
        while(n.next != null) n=n.next;
        return n;
    }

    void appendToTail(int d){
        Node end = endNode();
        end.next = new Node(d);
    }

    void appendAfterHead(int d){
        Node first = new Node(d);
        first.next = head.next;
        head.next = first;
    }

    void deleteAlld(int d){  // delete all node with data = d
        Node n = head;
        while(n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                //break;
            }
            //else if(n.next != null) n = n.next;
            else n = n.next;
        }
    }

    boolean deleteNode(Node n){
        // if n.next is null we dont knwo how to make n null given only node n
        if (n == null || n.next == null) return false;
        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }

    void printList(){
        Node n = head.next;
        while(n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.print("\n");
    }
}
