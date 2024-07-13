public class D0221_143 {
    public static void main(String[] args){
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        reorderList(root);
        while (root!=null){
            System.out.print(root.val+"->");
        }
    }

    public static void reorderList(ListNode head) {
        //查找链表中间节点+反转链表（获得新链表）+链表合并
        //找中间节点
        ListNode mid = findMidNode(head);
        //中间节点之后的部分做链表反转
        ListNode head2 = mid.next; mid.next = null;
        head2 = reverseList(head2);
        ListNode head1 = head;
        mergeList(head1,head2);
    }

    public static ListNode findMidNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
            }
        }
        return slow;
    }

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void mergeList(ListNode head1,ListNode head2){
        ListNode l1 = null;
        ListNode l2 = null;
        while (head1!=null && head2!=null){
            l1 = head1.next;
            l2 = head2.next;
            head1.next = head2;
            head1 = l1;
            head2.next = head1;
            head2 = l2;
        }
    }
}
