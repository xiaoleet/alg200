public class D0717_61 {
    //跑不起来，直接粘贴到leetcode上跑吧，因为是直接在leetcode上写通过的，不是在idea里调试完粘贴过去的
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode dummyHead = new ListNode(-1);
        ListNode oldHead = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode p = head;
        int len = 0;
        while(p!=null){
            len++;
            p = p.next;
        }
        k = k%len;
        if(k == 0) return head;
        while(k>0 && fast.next!=null){
            fast = fast.next;
            k--;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        dummyHead.next = slow.next;
        slow.next = null;
        fast.next = oldHead;
        return dummyHead.next;
    }
}
