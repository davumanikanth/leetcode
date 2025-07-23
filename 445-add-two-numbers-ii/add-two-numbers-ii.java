import java.math.BigInteger;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) return l1;
      StringBuilder first=new StringBuilder();
      StringBuilder second=new StringBuilder();
      ListNode current=l1;
      ListNode current1=l2;
      while(current!=null)
      {
        first.append(current.val);
        current=current.next;
        
      } 
      while(current1!=null)
      {
        second.append(current1.val);
        current1=current1.next;
      } 
      BigInteger f1=new BigInteger(first.toString());
      BigInteger f2=new BigInteger(second.toString());
      BigInteger f3=f1.add(f2);

      String value=f3.toString();
      ListNode head=null;
      ListNode tail=null;

      for(int i=0;i<value.length();i++)
      
      {
        int digit=value.charAt(i)-'0';
        ListNode newnode=new ListNode(digit);
        if(head==null)
        {
            head=newnode;
            tail=newnode;

        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }


        }


return head;

      
    
    }
}