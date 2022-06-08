package zkdlu.leetcode.twopointer;

import zkdlu.leetcode.Problem;

public class MiddleOfTheLinkedList extends Problem {
    public ListNode middleNode(ListNode head) {
        int nodeCount = 0;
        ListNode temp = head;
        while (temp != null) {
            nodeCount++;
            temp = temp.next;
        }

        temp = head;
        for (int i = 0; i < nodeCount / 2; i++) {
            temp = temp.next;
        }

        return temp;
    }

    @Override
    public void run() {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode output = middleNode(input);

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
