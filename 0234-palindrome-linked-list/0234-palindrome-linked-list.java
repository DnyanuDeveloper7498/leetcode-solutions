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
    public boolean isPalindrome(ListNode head) {
        
        ListNode left=head;
        ListNode right=head;

        while(right!=null && right.next!=null)
        {
            left=left.next;
            right=right.next.next;
        }
         // revers second half

         ListNode prev=null;

         while(left!=null)
         {
            ListNode next=left.next;
            left.next=prev;
            prev=left;
            left=next;
         }

         ListNode left2=head;
         ListNode right2=prev;

         while(right2!=null)
         {
            if(left2.val!=right2.val)
            {
                return false;
            }
            left2=left2.next;
            right2=right2.next;
         }
      return true;
    }
}