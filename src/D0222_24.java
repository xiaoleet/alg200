public class D0222_24 {
    public static void main(String[] args){
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        ListNode head = swapPairs(root);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode r = dummyHead;
        ListNode p = r.next;
        ListNode q = p.next;
        while (p!=null && q!=null){
            //交换指针
            p.next = q.next;
            q.next = p;
            r.next = q;
            //更新指针
            r = p;
            p = p.next;
            if(p!=null){
                q = p.next;
            }
        }
        return dummyHead.next;
    }
}
