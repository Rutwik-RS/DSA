/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node cur = head;
        Map<Node,Node> mp = new HashMap<>();
        while(cur!=null)
        {
            mp.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur = head;
        while(cur!=null)
        {
            Node dn = mp.get(cur);
            dn.next = mp.get(cur.next);
            dn.random = mp.get(cur.random);
            cur=cur.next;
        }
        return mp.get(head);
    }
}