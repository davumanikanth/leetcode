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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> result=new LinkedHashSet<>();
        ListNode curr1=head;
        while(curr1!=null)
        {
            result.add(curr1.val);
            curr1=curr1.next;
        }
        ListNode head1=null;
        ListNode tail=null;
        for(int num:result)
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