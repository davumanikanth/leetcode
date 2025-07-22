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
    public ListNode middleNode(ListNode head) {
         ListNode curr1=head;
       List<Integer> result=new ArrayList<>();

       while(curr1!=null) 
       {
         result.add(curr1.val);
         curr1=curr1.next;
       }
       
      
       ListNode head1=null;
       ListNode tail=null;
       int mid=0;
       if(result.size()%2==0)
       {

       
        mid=result.size()/2;
       }
       else
       {
        mid=result.size()/2;

       }
       for(int i=mid;i<result.size();i++)
       {
           ListNode newnode=new ListNode(result.get(i));
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