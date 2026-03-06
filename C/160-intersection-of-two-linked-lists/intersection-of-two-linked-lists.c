/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


// Two Pointer :

struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    struct ListNode *nodeA = headA;
    struct ListNode *nodeB = headB;

    while(nodeA != nodeB){
        if(nodeA == NULL){
            nodeA = headB;
        } else {
            nodeA = nodeA->next;
        }

        if(nodeB == NULL){
            nodeB = headA;
        } else {
            nodeB = nodeB->next;
        }
    }
    return nodeA;
}


/*

// Brute Force Method :

struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    struct ListNode *nodeA = headA;
    while(nodeA != NULL){
        struct ListNode *nodeB = headB;
        while(nodeB != NULL){
            if(nodeA == nodeB){
                return nodeA;
            }
            nodeB = nodeB->next;
        }
        nodeA = nodeA->next;
    }
    return NULL; 
}

*/