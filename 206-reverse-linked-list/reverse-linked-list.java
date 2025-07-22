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
    public ListNode reverseList(ListNode head) {
          ListNode current=head;
        List<Integer> list=new ArrayList<>();
        
        while(current!=null)
        {
            list.add(current.val);
            current=current.next;
        }
     
     ListNode head1=null;
            ListNode tail=null;
        for(int i=list.size()-1;i>=0;i--)
        {
            
            ListNode newnode=new ListNode(list.get(i));
            if(head1==null)
            {
                head1=newnode;
                tail=newnode;
            }
            else
            {
                //we are going to insert at the end;
                tail.next=newnode;
                tail=newnode;
            }
            
        }
        return head1;

    }
}