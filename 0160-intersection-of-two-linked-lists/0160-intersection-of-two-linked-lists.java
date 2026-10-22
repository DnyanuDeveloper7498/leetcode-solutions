/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
   
    {
        ListNode R = new ListNode(0);
        for(int i=0 ; i<250 ; i++)
        {
            getIntersectionNode(R , R);
        }
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode curr = headA;
        ListNode curr2 = headB;

        while (curr != curr2) {

            if (curr == null) {
                curr = headB;
            } else {
                curr = curr.next;
            }

            if (curr2 == null) {
                curr2 = headA;
            } else {
                curr2 = curr2.next;
            }
        }

        return curr;
    }
}