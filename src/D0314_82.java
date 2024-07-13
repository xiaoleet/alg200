public class D0314_82 {
    public static void main(String args[]){
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next= new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        //head.next.next.next.next.next.next = new ListNode(5);
        ListNode newHead = deleteDuplicates(head);
        while (newHead!=null){
            System.out.print(newHead.val);
            newHead = newHead.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = pre;
        while (cur!=null){
            while (cur!=null && cur.next!=null && cur.next.next!=null &&(cur.val == cur.next.val || cur.next.val == cur.next.next.val)){
                cur = cur.next;
            }
//            if(cur.next!=null && cur.next.next==null && cur.val == cur.next.val){
//                cur = null;
//                pre.next = cur;
//                break;
//            }
            if(cur.next!=null){
                pre.next = cur.next;
                pre = cur.next;
            }
            cur = cur.next;
        }
        return dummyHead.next;
    }
}
