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
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int cnt=1;
        while(cur!=null)
        {
            cur=cur.next;
            cnt++;
        }
        ListNode s = head;
        ListNode f = head;
        while(f.next!=null && f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        if(cnt % 2 != 0)
         s=s.next;
        return s;
    }
}