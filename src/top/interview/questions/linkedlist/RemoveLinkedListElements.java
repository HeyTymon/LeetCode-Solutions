package top.interview.questions.linkedlist;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode currentNode = dummyHead;
        ListNode previousNode = dummyHead;

        while(currentNode != null)
        {

        }

        return dummyHead.next;
    }
}
