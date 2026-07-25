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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = new ListNode(-1);
        ListNode p2 = new ListNode(-1);
        ListNode a = p1;
        ListNode b=p2;
        p1.next=headA;
        p2.next=headB;
        while(a.next!=null)
        {
            b=p2;
            while(b.next!=null)
            {
                if(a.next == b.next)
                {
                    return a.next;
                }
                b=b.next;
            }
            a=a.next;
        }
        return null;
    }
}