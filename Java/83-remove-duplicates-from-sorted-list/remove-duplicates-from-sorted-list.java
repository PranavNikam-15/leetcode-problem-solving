/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) {
            return null;
        }

        ListNode curr = head;

        while(curr != null && curr.next != null) {

            ListNode nextNode = curr.next;

            while(nextNode != null && nextNode.val == curr.val) {
                nextNode = nextNode.next;
            }

            curr.next = nextNode;
            curr = curr.next;
        }

        return head;
    }
}