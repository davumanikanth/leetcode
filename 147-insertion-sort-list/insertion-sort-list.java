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
    public ListNode insertionSortList(ListNode head) {
      List<Integer> result=new ArrayList<>();
      ListNode current=head;
      while(current!=null)
      {
        result.add(current.val);
        current=current.next;
      }  
      Collections.sort(result);
      ListNode head1=null;
            ListNode tail=null;
        for(int i=0;i<result.size();i++)
        {
            
            ListNode newnode=new ListNode(result.get(i));
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