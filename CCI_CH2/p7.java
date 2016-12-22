import java.util.Stack;
import java.lang.*;
class p7{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.appendToTail(4);
        list.appendToTail(5);
        list.appendToTail(5);
        list.appendToTail(4);
        list.appendToTail(3);
        list.appendToTail(2);
        list.appendToTail(1);
        list.printList();
        p7 p = new p7();
        System.out.println(p.CheckPalindrome(list));
    }

    boolean CheckPalindrome(LinkedList list){
            Stack<Integer> st = new Stack<Integer>();
            LinkedList.Node n = list.head.next;
            int len = length(list);
            int odd = 0;
            if(len%2 == 0) odd = 0;
            else odd = 1;
            for(int i=0;i<(len-odd)/2;i++){
                st.push(n.data);
                n = n.next;
            }
            if(odd == 1) n =n.next;
            while(!st.empty()){
                if(st.pop().intValue() != n.data) return false;
                n = n.next;
            }
            return true;
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
