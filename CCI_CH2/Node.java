class Node{
    Node next = null;
    int data;

    Node(int d){
        data = d;
    }

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    void deleteNode(int d){  // delete ONE node with data = d 
        Node n = this;
        while(n.next != null){
            if(n.data == d){
                n.data = n.next.data;
                n.next = n.next.next;
                break;
            }
            if(n.next.data == d && n.next.next == null){
                n.next = null;
                break;
            }
            n = n.next;
        }
    }

    void printList(){
        Node n = this;
        while(n.next != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println(n.data);
    }


}
