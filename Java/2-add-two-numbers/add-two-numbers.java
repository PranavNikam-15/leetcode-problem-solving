class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode resultNode = result;

        int carry = 0;

        while(l1 != null || l2 != null) {

            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;

            int total = n1 + n2 + carry;
            int digit = total % 10;

            carry = total / 10;

            ListNode node = new ListNode(digit);
            resultNode.next = node;

            resultNode = resultNode.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        if(carry > 0) {
            resultNode.next = new ListNode(carry);
        }

        return result.next;
    }
}