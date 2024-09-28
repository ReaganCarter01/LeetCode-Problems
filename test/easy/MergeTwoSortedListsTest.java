package easy;
import DataStructures.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedListsTest {

    // Helper method to convert an array to a linked list
    private ListNode arrayToList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to compare two linked lists
    private boolean compareLists(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

    @Test
    public void testMergeList1() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        ListNode list1 = arrayToList(arr1);
        ListNode list2 = arrayToList(arr2);
        ListNode expected = arrayToList(new int[]{1, 1, 2, 3, 4, 4});
        ListNode result = solution.mergeTwoLists(list1, list2);

        assertTrue(compareLists(expected, result));
    }

    @Test
    public void testMergeEmptyLists() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        ListNode list1 = null;
        ListNode list2 = null;
        ListNode expected = null;
        ListNode result = solution.mergeTwoLists(list1, list2);

        assertTrue(compareLists(expected, result));
    }

    @Test
    public void testMergeFirstListEmpty() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        ListNode list1 = null;
        int[] arr2 = {0};
        ListNode list2 = arrayToList(arr2);
        ListNode expected = arrayToList(new int[]{0});
        ListNode result = solution.mergeTwoLists(list1, list2);

        assertTrue(compareLists(expected, result));
    }

    @Test
    public void testMergeSecondListEmpty() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        int[] arr1 = {1, 2, 3};
        ListNode list1 = arrayToList(arr1);
        ListNode list2 = null;
        ListNode expected = arrayToList(new int[]{1, 2, 3});
        ListNode result = solution.mergeTwoLists(list1, list2);

        assertTrue(compareLists(expected, result));
    }

    @Test
    public void testMergeListsWithSameElements() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        int[] arr1 = {2, 2, 2};
        int[] arr2 = {2, 2, 2};
        ListNode list1 = arrayToList(arr1);
        ListNode list2 = arrayToList(arr2);
        ListNode expected = arrayToList(new int[]{2, 2, 2, 2, 2, 2});
        ListNode result = solution.mergeTwoLists(list1, list2);

        assertTrue(compareLists(expected, result));
    }
}
