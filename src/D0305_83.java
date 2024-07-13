public class D0305_83 {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode newNode = deleteDuplicates(head);
        while (newNode !=null){
            System.out.print(newNode.val+"->");
            newNode = newNode.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(-101);
        dummyHead.next = head;
        ListNode slow = dummyHead;
        ListNode  fast = head;
        while (fast!=null){
            while (fast!=null && slow.val == fast.val){
                fast = fast.next;
            }
            slow.next = fast;
            slow = fast;
            if(fast!=null)fast = fast.next;
        }
        return dummyHead.next;
    }
}
