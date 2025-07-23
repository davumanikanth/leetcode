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
       if(head==null || n==0) return head;
        ArrayList<Integer> group=new ArrayList<>();
        ListNode current=head;
        int count=0;
        while(current!=null)
        {
            count++;
            group.add(current.val);
            current=current.next;
        }
        ListNode emp=null;
        ListNode head2=null;
        if(n>count)
        {
           return head;
        }
        group.remove(group.size()-n);
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