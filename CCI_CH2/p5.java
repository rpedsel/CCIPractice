class p5{
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.appendToTail(3);
        list1.appendToTail(3);
        list1.appendToTail(4);
        list1.appendToTail(8);
        list2.appendToTail(9);
        list2.appendToTail(9);
        list2.appendToTail(7);
        list1.printList();
        list2.printList();
        LinkedList sumlist = new LinkedList();
        p5 p = new p5();
        sumlist = p.AddDigitRev(list1,list2);
        sumlist.printList();
    }

    LinkedList AddDigitRev(LinkedList list1, LinkedList list2){
        int carrier = 0;
        LinkedList sumlist = new LinkedList();
        LinkedList.Node p1 = list1.head.next;
        LinkedList.Node p2 = list2.head.next;
        while(p1 != null || p2 != null){
            if(p1 != null && p2 != null){
                carrier = p1.data+p2.data + carrier;
                sumlist.appendToTail(carrier%10);
                carrier = (carrier - carrier%10)/10;
                p1 = p1.next;
                p2 = p2.next;
            }
            else if(p1 != null && p2 == null){
                carrier = p1.data+carrier;
                sumlist.appendToTail(carrier%10);
                carrier = (carrier - carrier%10)/10;
                p1 = p1.next;
            }
            else if(p1 == null && p2 != null){
                carrier = p2.data+carrier;
                sumlist.appendToTail(carrier%10);
                carrier = (carrier - carrier%10)/10;
                p2 = p2.next;
            }
        }
        if (carrier != 0) sumlist.appendToTail(carrier);
        return sumlist;
    }
}
