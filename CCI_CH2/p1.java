import java.util.HashSet;
class p1{
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
            p1 p = new p1();
            p.removeDuplicate2(list);
            list.printList();
    }

    // with buffer
    void removeDuplicate1(LinkedList list){
         LinkedList.Node n = list.head;
         HashSet<Integer> set = new HashSet<Integer>();
         while(n.next != null){
             if(set.contains(n.next.data)){
                 n.next = n.next.next;
             }
             else{
                 set.add(n.next.data);
                 n = n.next;
             }
         }
    }

    // without buffer
    void removeDuplicate2(LinkedList list){
        LinkedList.Node cur = list.head.next;
        while(cur != null){
            LinkedList.Node runner = cur;
            while(runner.next != null){
                if(cur.data == runner.next.data){
                    runner.next = runner.next.next;
                }
                else runner = runner.next;
            }
            cur = cur.next;
        }
    }

}
