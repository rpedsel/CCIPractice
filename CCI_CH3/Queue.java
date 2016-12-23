class Queue{

    Node first = null;
    Node last = null;

    void enqueue(int item){
        if(first == null){
            last = new Node(item);
            first = last;
        }
        else{
            last.next = new Node(item);
            last = last.next;
        }
    }

    Integer dequeue(){
        if(first != null){
            Integer item = first.data;
            first = first.next;
            if(first == null) last = null;
            return item;
        }
        return null;
    }


    class Node{
        Node next;
        Integer data;

        public Node(int d){
            data = new Integer(d);
        }
    }
}
