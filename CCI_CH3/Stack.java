class Stack{
    Node top = null;

    // Integer --> possible to be null
    Integer pop(){
        if(top != null){
            Integer item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    void push(int item){
        Node t = new Node(item);
        t.next = top;
        top = t;
    }

    // possible to be null
    Integer peek(){
        if(top != null) return top.data;
        return null;
    }

    class Node{
        Node next = null;
        Integer data;

        public Node(int d){
            data = new Integer(d);
        }
    }
}
