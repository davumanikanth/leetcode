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
    public int pairSum(ListNode head) {
        
       
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null)
        {

           slow=slow.next;
           fast=fast.next.next;

        }
        ListNode second=reverse(slow);
        ListNode first=head;
        int max=0;
        while(second!=null)
        {
            max=Math.max(first.val+second.val,max)
;
             first=first.next;
             second=second.next;
        }
        return max;
        
    }
    public ListNode reverse(ListNode head1)
    {
        ListNode prev=null;
        ListNode curr2=head1;
        while(curr2!=null)
        {
            ListNode next=curr2.next;
            curr2.next=prev;
            prev=curr2;
            curr2=next;
        }
        return prev;

    }
}