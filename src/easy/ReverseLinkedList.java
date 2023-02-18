package easy;

/**
 * Time complexity O(n)
 * Space complexity O(1)
 * Author: Sergey.
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode cur = node1;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
        System.out.println("---");

        ListNode solve = solve(node1);
        cur = solve;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }


    public static ListNode solve(ListNode node) {
        ListNode prev = null;
        ListNode cur = node;
        ListNode next = null;
        while (cur != null){
            // 1 -> 2 -> 3 -> null
            //null <- 1 <- 2 <- 3
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

