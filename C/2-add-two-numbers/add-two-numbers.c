/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* temp = (struct ListNode*)malloc(sizeof(struct ListNode));
    temp->val = -1;
    temp->next = NULL;
    
    struct ListNode* curr = temp;
    int carry = 0;

    while(l1 != NULL || l2 != NULL) {

        int l1_val = (l1 != NULL) ? l1->val : 0;
        int l2_val = (l2 != NULL) ? l2->val : 0;

        int total = l1_val + l2_val + carry;
        carry = total / 10;

        struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
        node->val = (total % 10);
        node->next = NULL;

        curr->next = node;
        curr = curr->next;

        if (l1 != NULL) l1 = l1->next;
        if (l2 != NULL) l2 = l2->next;
    } 

    if(carry > 0){
        struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
        node->val = carry;
        node->next = NULL;
        curr->next = node;
    }

    return temp->next;
}