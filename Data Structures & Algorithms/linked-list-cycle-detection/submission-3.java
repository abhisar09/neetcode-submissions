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
    public boolean hasCycle(ListNode head) {
        ListNode node=head;
        Set<ListNode> set= new HashSet<>();
        while(node!=null)
        {
            if(!set.contains(node))
            {
                set.add(node);
                node=node.next;
            }
            else if(set.contains(node))
            {
                return true;
            }
        }
        return false;
    }
}
