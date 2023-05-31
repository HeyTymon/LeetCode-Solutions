package top.interview.questions.linkedlist;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode previous = null;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = previous;
            previous = head;
            head = nextNode;
        }


        return previous;
    }
}
