import java.util.List;

public class D0318_148 {
    public static void main(String args[]){
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode newHead = sortList(head);
        while (newHead!=null){
            System.out.println(newHead.val);
            newHead = newHead.next;
        }

    }

    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = mergeSort(head,null);
        return newHead;
    }

    public static ListNode mergeSort(ListNode head,ListNode tail){
        if(head == null) return head;
        if(head.next == tail) {
            head.next = null;
            return head;
        }
        //找归并的折半位置
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=tail){
            slow = slow.next;
            fast = fast.next;
            if(fast!=tail){
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode l1 = mergeSort(head,mid);
        ListNode l2 = mergeSort(mid,fast);
        ListNode sorted = mergeTwoLists(l1,l2);
        return sorted;
    }

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2){
        ListNode l1 = head1;
        ListNode l2 = head2;
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        while (l1!=null && l2!=null){
            if(l1.val<=l2.val){
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if(l1!=null){
            p.next = l1;
        }else if(l2!=null){
            p.next = l2;
        }
        return dummyHead.next;
    }

}
