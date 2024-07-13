public class D0327_20_05 {
    public static void main(String args[]){
        ListNode head1 = new ListNode(7);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(6);
        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(2);
        ListNode newHead = addTwoNumbers(head1,head2);
        while (newHead!=null){
            System.out.println(newHead.val);
            newHead =  newHead.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        int carry = 0;
        while (l1!=null || l2 !=null || carry!=0){
            int sum = 0;
            if(l1!=null){
                sum = sum+ l1.val;
                l1 = l1.next;
            }
            if(l2!=null) {
                sum = sum+ l2.val;
                l2 = l2.next;
            }
            if(carry!=0) sum = sum+carry;
            p.next = new ListNode(sum%10);
            p = p.next;
            carry = sum/10;


        }
        return dummyHead.next;
    }
}
