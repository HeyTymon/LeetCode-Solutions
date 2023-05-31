package top.interview.questions.linkedlist;

public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode leftPointer = dummyNode;
        ListNode rightPointer = dummyNode;

        //n + 1 -> the 1 is here because we start from dummyNode
        for (int i = 1; i <= n + 1; i++) {
            rightPointer = rightPointer.next;
        }

        while (rightPointer != null) {
            leftPointer = leftPointer.next;
            rightPointer = rightPointer.next;
        }

        leftPointer.next = leftPointer.next.next; //Stepping over the n-th element

        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        removeNthFromEnd(l1, 2);
    }

}
