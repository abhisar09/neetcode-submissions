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
        int c=0;
        ListNode node=head;
        while(node!=null)
        {c++;node=node.next;}
        n=c-n;
        if(n==0)
        return head.next;
        node=head;
        for(int i=1;i<n;i++)
        {
            node=node.next;
        }
        node.next=node.next.next;
        return head;
    }
}
