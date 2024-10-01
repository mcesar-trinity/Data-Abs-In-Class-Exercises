import java.util.LinkedList;

public class reverseLink {

    public class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    
    }
    
    public ListNode reverseList(ListNode head) {

        ListNode start = head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while(head.next != null) {
            curr = next;
            head.next = prev;
            
        }
        return head;

    }
    
    
    
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

    }
}
