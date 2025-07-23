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
    public ListNode sortList(ListNode head) {
        List<Integer> group=new ArrayList<>();
        ListNode current=head;
        while(current!=null)
        {
            group.add(current.val);
            current=current.next;
        }
        Collections.sort(group);
        ListNode head1=null;
        ListNode tail=null;
        for(int num:group)
        {
            ListNode newnode=new ListNode(num);
            if(head1==null)
            {
                head1=newnode;
                tail=newnode;
            }
            else
            {
                tail.next=newnode;
                tail=newnode;

            }

        }
        return head1;
        
    }
}