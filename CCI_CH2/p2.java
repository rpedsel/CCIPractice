class p2{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.appendToTail(2);
        list.appendToTail(2);
        list.appendToTail(1);
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(1);
        list.appendToTail(3);
        list.appendToTail(2);
        list.printList();

        p2 p = new p2();
        LinkedList kthList = p.kthToLast(list,5);
        kthList.printList();

        LinkedList kthListR = new LinkedList();
        int i = kthToLastRecursive(list.head.next, 5, kthListR);
        kthList.printList();
    }

    // iteratively use two runners
    LinkedList kthToLast(LinkedList list, int k){
        LinkedList kthList = new LinkedList();
        LinkedList.Node p1 = list.head.next;
        LinkedList.Node p2 = list.head.next;
        for (int i=0;i<k-1;i++){
            if(p1 == null) return kthList;
            p1 = p1.next;
        }
        if(p1 == null) return kthList;

        while(p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        kthList.head.next = p2;
        return kthList;
    }

    // recursive
    static int kthToLastRecursive(LinkedList.Node n, int k, LinkedList kthList){
        if(n == null){
            return 0;
        }
        int i = kthToLastRecursive(n.next,k, kthList)+1;
        if(i <= k){
            kthList.appendAfterHead(n.data);
        }
        return i;
    }
}
