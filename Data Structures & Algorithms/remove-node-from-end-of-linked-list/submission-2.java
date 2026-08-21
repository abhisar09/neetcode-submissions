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
        ArrayList<ListNode> list=new ArrayList<ListNode>();
        ListNode curr=head;
        while(curr!=null)
        {
            list.add(curr);
            curr=curr.next;
        }
        if(list.size()-n==0)
        return head.next;
        list.remove(list.size()-n);
        ListNode dummy=new ListNode(0);
        curr=dummy;
        for(ListNode node : list)
        {
            curr.next=node;
            curr=curr.next;
        }
        curr.next=null;
        return dummy.next;
    }
}
