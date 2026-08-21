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
        HashMap<ListNode,Integer> mpp= new HashMap<>();
        while(node!=null)
        {
            if(!mpp.containsKey(node))
            mpp.put(node,1);
            else if(mpp.containsKey(node))
            {
                return true;
            }
            node=node.next;
        }
        return false;
    }
}
