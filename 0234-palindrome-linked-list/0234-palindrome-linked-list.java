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
        Stack<Integer> st = new Stack<>();
        ListNode p1 = head;
        int len=0;
        while(p1!=null)
        {
            len++;
            st.push(p1.val);
            p1=p1.next;
            
        }
        ListNode cur = head;
        int c=0;
        while(cur!=null && st.peek() == cur.val)
        {
            st.pop();
            c++;
            cur=cur.next;
        }
        if(c==len)
        return true;
        return false;
    }
}