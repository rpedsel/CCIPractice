class p6{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.appendToTail(4);
        list.appendToTail(5);
        list.appendToTail(6);
        LinkedList.Node loopStart = list.endNode();
        list.appendToTail(7);
        list.appendToTail(8);
        list.appendToTail(9);
        list.appendToTail(10);

        list.endNode().next = loopStart;
        loopStart = list.head.next;
        for(int i=0;i<25;i++){
            System.out.print(loopStart.data+" ");
            loopStart = loopStart.next;
        }
        System.out.println();
        p6 p = new p6();
        System.out.println(p.FindLoopStart(list).data);

    }

    LinkedList.Node FindLoopStart(LinkedList list){
        LinkedList.Node p1 = list.head.next;
        LinkedList.Node p2 = list.head.next;
        while(p1 != null && p1.next != null){
            p2 = p2.next;
            p1 = p1.next.next;
            if(p1 == p2) break; // p1 meet p2 (Collisionspot)
        }
        // ERROR CHECK!! if there is no loop!!
        if(p1 == null || p1.next == null) return null;

        p1 = list.head.next;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
