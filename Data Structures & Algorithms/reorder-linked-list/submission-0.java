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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head2=reverseList(head2);
        ListNode curr1=head;
        ListNode curr2=head2;
        while(curr2!=null&&curr1!=null)
        {
            ListNode temp1=curr1.next;
            ListNode temp2=curr2.next;
            curr1.next=curr2;
            curr2.next=temp1;
            curr1=temp1;
            curr2=temp2;
        }
    }
    public ListNode reverseList(ListNode node)
    {
        if(node==null)
        return null;
            ListNode newHead=node;
            if(node.next!=null)
            {
                newHead=reverseList(node.next);
                node.next.next=node;
            }
            node.next=null;
        return newHead;
    }
}
