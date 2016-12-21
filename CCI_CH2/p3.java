class p3{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.appendToTail(4);
        list.appendToTail(5);
        list.appendToTail(6);
        list.appendToTail(7);
        list.appendToTail(8);
        list.printList();
        LinkedList.Node cur = list.head.next;
        for(int i=0;i<4;i++) cur = cur.next;
        list.deleteNode(cur);
        list.printList();
    }
}
