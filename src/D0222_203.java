public class D0222_203 {
    public static void main(String[] args){
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        int val = 3;
        removeElements(root,val);
        while (root!=null){
            System.out.println(root.val);
            root = root.next;
        }

    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        ListNode p = head;
        while (p!=null){
            while (p!=null && p.val == val){
                p = p.next;
            }
            cur.next = p;
            cur = p;
            if(p!=null) p = p.next;
        }
        return dummyHead.next;
    }
}
