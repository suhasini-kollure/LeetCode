package com.programmingskils;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to act as the start of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Initialize pointers for list1 and list2
        ListNode p1 = list1;
        ListNode p2 = list2;

        // Traverse both lists and merge them in sorted order
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }

        // Attach any remaining nodes from list1 or list2
        if (p1 != null) {
            current.next = p1;
        } else if (p2 != null) {
            current.next = p2;
        }

        // The merged list starts from dummy.next
        return dummy.next;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the mergeTwoLists function
    public static void main(String[] args) {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        // Example 1
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList1 = solution.mergeTwoLists(list1, list2);
        System.out.print("Merged List 1: ");
        printList(mergedList1); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> null

        // Example 2
        ListNode list3 = null;
        ListNode list4 = null;
        ListNode mergedList2 = solution.mergeTwoLists(list3, list4);
        System.out.print("Merged List 2: ");
        printList(mergedList2); // Output: null

        // Example 3
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);
        ListNode mergedList3 = solution.mergeTwoLists(list5, list6);
        System.out.print("Merged List 3: ");
        printList(mergedList3); // Output: 0 -> null
    }
}
