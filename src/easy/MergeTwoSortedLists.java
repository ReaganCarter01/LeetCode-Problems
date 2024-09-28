package easy;

// Problem: https://leetcode.com/problems/merge-two-sorted-lists/
// Approach:
// Topics: Linked List, Recursion

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

import DataStructures.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode holder = new ListNode(-1);
        ListNode current = holder;

        while(list2 != null && list1 != null){
           if(list1.val <= list2.val){
               current.next = list1;
               System.out.println(current);
               list1 = list1.next;
           }else{
               current.next = list2;
               System.out.println(current);
               list2 = list2.next;
           }
           current = current.next;
            System.out.println(current);
        }

        if(list1 != null){
            current.next = list1;
        }else{
            current.next = list2;
        }

    return holder.next;
    }
}
