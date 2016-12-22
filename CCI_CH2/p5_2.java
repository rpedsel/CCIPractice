class p5_2{
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.appendToTail(3);
        list1.appendToTail(6);
        list1.appendToTail(7);
        list2.appendToTail(8);
        list2.appendToTail(9);
        list2.appendToTail(5);
        list2.appendToTail(7);
        list1.printList();
        list2.printList();
        p5_2 p = new p5_2();
        p.AddDigitFwd(list1,list2).printList();
    }
    LinkedList AddDigitFwd(LinkedList list1, LinkedList list2){
        LinkedList list = new LinkedList();
        LinkedList.Node p1 = list1.head.next;
        LinkedList.Node p2 = list2.head.next;
        int value1 = 0;
        int value2 = 0;
        int value, digit;
        int len1 = length(list1);
        int len2 = length(list2);
        for (int i=len1-1;i>=0;i--){
            value1 += p1.data*Math.pow(10,i);
            p1 = p1.next;
        }
        for (int i=len2-1;i>=0;i--){
            value2 += p2.data*Math.pow(10,i);
            p2 = p2.next;
        }
        value = value1+value2;
        while(value != 0){
            digit = value%10;
            list.appendAfterHead(digit);
            value = (value-digit)/10;
        }
        return list;
    }
    int length(LinkedList list){
        LinkedList.Node n = list.head.next;
        int len = 0;
        while(n != null){
            len++;
            n = n.next;
        }
        return len;
    }
}
