public class mergetwosortedlist {

    public static ListNode mergelist(ListNode l1, ListNode l2) {

        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;

        while(l1 != null && l2 != null) {

            if(l1.val <= l2.val) {
                current_node.next = l1;
                l1 = l1.next;
            } else {
                current_node.next = l2;
                l2 = l2.next;
            }
            current_node = current_node.next;
        }

        current_node.next = (l1 != null) ? l1 : l2;

        return temp_node.next;


    }

    public static void main(String[] args) {


       ListNode l1 = new ListNode(1);
       l1.next = new ListNode(2);
       l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        while(l1.next != null) {

            System.out.println(l1.val);

        }

        ListNode l3 = mergelist(l1, l2);




    }

}
