package easy;

/**
 * Time complexity O(n)
 * Space complexity O(1)
 * Author: Sergey.
 */
public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node33 = new ListNode(3);
        ListNode node22 = new ListNode(2, node33);
        ListNode node11 = new ListNode(1, node22);

        ListNode res = solve(node1, node11);

        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode solve(ListNode list1, ListNode list2){
        ListNode head = new ListNode();
        ListNode tail = head;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
               list1 = list1.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null){
            tail.next = list1;
        }else {
            tail.next = list2;
        }

        return head.next;
    }
}
