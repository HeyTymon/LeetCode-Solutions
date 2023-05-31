package top.interview.questions.linkedlist;

public class DeleteNode {
    public void deleteNode(ListNode node) {

        ListNode nextNode = node.next;

        node.val = nextNode.val;

        node.next = nextNode.next;

    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
