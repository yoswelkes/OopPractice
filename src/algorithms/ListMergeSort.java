package algorithms;

class ListMergeSort {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to serve as the starting point
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Loop through both lists until one is exhausted
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // Point to the smaller value (list1)
                list1 = list1.next;   // Move list1 pointer forward
            } else {
                current.next = list2; // Point to the smaller value (list2)
                list2 = list2.next;   // Move list2 pointer forward
            }
            current = current.next;   // Move the current pointer forward
        }

        // If any elements are left in list1 or list2, append them
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list, starting from the next node after dummy
        return dummy.next;
    }
}

