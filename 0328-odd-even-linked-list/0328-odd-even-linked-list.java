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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(-1);
        ListNode odd = new ListNode(-1);
        ListNode o = odd;
        ListNode e= even;
        int p=1;
        ListNode cur = head;
        while(cur!=null)
        {
            if(p %2==0)
            {e.next = cur;
              e=e.next;
            }
            else {o.next = cur;
            o=o.next;}
            p++;
            cur = cur.next;
        }
        e.next=null;
        o.next = even.next;
        return odd.next;
    }
}