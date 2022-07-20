class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class swaplist {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        // Listnode ln=new Listnode();
        ListNode ln = head;
        while (ln.next.next != null) {
            int temp = ln.val;
            ln.val = ln.next.next.val;
            ln.next.next.val = temp;
            ln = ln.next;
        }
        return head;
    }
}
