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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode len = head;
        ListNode cur = head;
        ListNode last = head;
        int n=0;
        while(len!=null)
        {
            n++;
            len = len.next;
        }
        k=k%n;
        while(k>0)
        {
            while(cur.next.next != null )
            {
                cur=cur.next;
            }
            last = cur.next;
            cur.next = null;
            last.next = head;
            head=last;
            cur=head;
            k--;
        }

        return head;
    }
}