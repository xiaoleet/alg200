public class D0215_234 {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode p1 = new ListNode(2);
//        ListNode p2 = new ListNode(2);
//        ListNode p3 = new ListNode(1);
        head.next = p1;
//        p1.next = p2;
//        p2.next = p3;
        //1,2,3,4,5
        boolean res = isPalindrome(head);
        System.out.print(res+" ");
    }
    public static boolean isPalindrome(ListNode head) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(head!=null){
            sb1.append(head.val);
            sb2.append(head.val);
            head = head.next;
        }
        String s1 = sb1.reverse().toString();
        String s2 = sb2.toString();
        return s1.equals(s2);
    }
}
