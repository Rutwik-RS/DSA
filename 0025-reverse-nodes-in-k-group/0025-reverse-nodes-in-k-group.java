/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    // Reverse a linked list
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        return prev;
    }

    // Find the kth node starting from head
    private ListNode findKthNode(ListNode head, int k) {
        while (head != null && --k > 0) {
            head = head.next;
        }
        return head;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode temp = head;
       ListNode prev=null;
       while(temp!=null)
       {
            ListNode KthNode = findKthNode(temp,k);
            if (KthNode == null) {
                if (prev != null)
                    prev.next = temp;
                break;
            }

            ListNode nextNode  = KthNode.next;
            KthNode.next = null;
            ListNode newHead = reverse(temp);
            if(temp == head)
            {
                head = newHead;

            }
            else
            prev.next = newHead;
            prev = temp;
            temp = nextNode;


       }
       return head;
    }
}
