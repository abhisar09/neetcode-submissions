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
        head2=reverseListI(head2);
        ListNode curr1=head;
        ListNode curr2=head2;
        while(curr2!=null)
        {
            ListNode temp1=curr1.next;
            ListNode temp2=curr2.next;
            curr1.next=curr2;
            curr2.next=temp1;
            curr1=temp1;
            curr2=temp2;
        }
    }
    public ListNode reverseListR(ListNode head)
    {
        if(head==null)
        return null;
        ListNode newHead=head;
        if(head.next!=null)
        {
            newHead=reverseListR(head.next);
            head.next.next=head;
        }
        head.next=null;
        return newHead;
    }
    public ListNode reverseListI(ListNode node)
    {
        if(node==null)
        return null;
        ListNode curr=node;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode temp= curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
