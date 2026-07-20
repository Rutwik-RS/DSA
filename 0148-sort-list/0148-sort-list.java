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
    public ListNode join(ListNode st,ListNode mid)
    {
        ListNode dn = new ListNode(-1);
        ListNode temp = dn;
        while(st!=null && mid!=null)
        {
            if(st.val <= mid.val)
            {
                temp.next = st;
                st=st.next;
            }
            else
            {
                temp.next=mid;
                mid=mid.next;
            }
            temp=temp.next;
        }
        if(st!=null)
        temp.next=st;
        if(mid!=null)
        temp.next=mid;
        return dn.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode f = head;
        ListNode s = head;
        while(f.next!=null && f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        f = s.next;
        s.next=null;
        return join(sortList(head), sortList(f));
    }
}