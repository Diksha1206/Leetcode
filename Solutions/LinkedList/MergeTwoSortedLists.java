package LinkedList;

class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode headNode = new ListNode(0);
        ListNode resultantNode = headNode;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                resultantNode.next = l1;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                resultantNode.next = l2;
                l2 = l2.next;
            }
            resultantNode = resultantNode.next;
        }

        if (l1 != null) {
            resultantNode.next = l1;
            l1 = l1.next;
        }

        if (l2 != null) {
            resultantNode.next = l2;
            l1 = l2.next;
        }

        return headNode.next;

    }
}