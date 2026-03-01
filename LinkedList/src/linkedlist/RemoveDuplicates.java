package linkedlist;

class Solution {
    public ListNode deleteDuplicates(ListNode node) {
        if (node == null)
            return node;
        ListNode Head = node;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return Head;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {

    }
}
