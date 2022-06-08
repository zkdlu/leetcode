package zkdlu.leetcode.twopointer.medium;

import zkdlu.leetcode.Problem;

public class RemoveNthNodeFromEndOfList extends Problem {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int nodeCount = 0;
        ListNode temp = head;
        while (temp != null) {
            nodeCount++;
            temp = temp.next;
        }

        if (nodeCount == n) {
            return head.next;
        }

        temp = head;
        ListNode prev = head;
        for (int i = 0; i < nodeCount - n; i++) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;

        return head;
    }

    @Override
    public void run() {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode output = removeNthFromEnd(input, 2);

//        printNodes(output);


        input = new ListNode(1);
        output = removeNthFromEnd(input, 1);

        printNodes(output);
    }
    private void printNodes(ListNode output) {
        ListNode temp = output;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public class ListNode {
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
    }
}
