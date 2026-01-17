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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head.next;
        
        ListNode dummy=new ListNode(0);
        ListNode result=dummy;
        int currsum=0;
        while(curr!=null)
        {
            if(curr.val==0)
            {
                result.next=new ListNode(currsum);//we are keeping in next pointe
                result=result.next;// we are moving to next pointer
                
                currsum=0;
                curr=curr.next;
            }
            else
            {
                currsum+=curr.val;
                curr=curr.next;
            }


      

        }
        return dummy.next;
        
        
    }
}