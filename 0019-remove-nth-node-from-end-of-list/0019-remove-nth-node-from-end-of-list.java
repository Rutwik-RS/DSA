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
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode len = head;
     int c=0;
     while(len!=null)
     {
        len=len.next;
        c++;
     }   
     int z = c-n;
     if(head == null || c==1)
     return null;
     ListNode cur = head;
     if(z==0){
     cur=cur.next;
     return cur;
    }
     int q=0;
     while(q+1 != z)
     {
        q++;
        cur=cur.next;
     }
     if(cur.next==null || cur.next.next==null)
     cur.next=null;
     else 
     cur.next=cur.next.next;
     return head;
    }
}