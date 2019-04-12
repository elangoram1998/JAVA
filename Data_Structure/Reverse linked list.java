/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        return revList(head,null);
    }
    static ListNode revList(ListNode curr,ListNode prev)
    {
        if(curr.next==null)
        {
            ListNode temp=curr;
            curr.next=prev;
            return curr;
        }
        ListNode node=curr.next;
        curr.next=prev;
        return revList(node,curr);
    }
}
