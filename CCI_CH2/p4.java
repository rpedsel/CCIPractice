class p4{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(4);
        list.appendToTail(8);
        list.appendToTail(3);
        list.appendToTail(6);
        list.appendToTail(5);
        list.appendToTail(7);
        list.printList();
        p4 p = new p4();
        list = p.Partition(list,5);
        list.printList();
    }

    LinkedList Partition(LinkedList list, int x){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList.Node n = list.head.next;
        while(n != null){
            if(n.data < x) list1.appendToTail(n.data);
            else list2.appendToTail(n.data);
            n = n.next;
        }
        list1.endNode().next = list2.head.next;
        return list1;
    }

}
