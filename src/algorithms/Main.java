package algorithms;

public class Main {
    public static void main(String[] args) {
        // Create nodes for list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create nodes for list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Create an instance of ListMergeSort to use the mergeTwoLists method
        ListMergeSort listMergeSort = new ListMergeSort();
        ListNode mergedList = listMergeSort.mergeTwoLists(list1, list2);

        // Print the merged list
        printList(mergedList);
    }

    // Helper function to print a linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
