/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        if(temp==null || temp.next==null)
        {
            return temp;
        }
        int temp1=temp.next.val;
        temp.next.val=temp.val;
        temp.val=temp1;
        swapPairs(temp.next.next);
        return temp;
    }
}
