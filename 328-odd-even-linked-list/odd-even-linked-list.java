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
    public ListNode oddEvenList(ListNode head) {
       List<Integer> odd=new ArrayList<>();
       List<Integer> even=new ArrayList<>();
        ListNode current=head;
        int count=0;
        while(current!=null)
        {
            count++;
            if(count%2==0)
            {
             even.add(current.val);
            }else
            {
               odd.add(current.val);
            }
            current=current.next;
        }
        List<Integer> group=new ArrayList<>();
        for(int num:odd)
        {
            group.add(num);
        }
        for(int num:even)
        {
            group.add(num);
        }
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