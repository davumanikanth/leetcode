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
        ListNode current=l1;
        ListNode current1=l2;
        StringBuilder first=new StringBuilder();
        StringBuilder second=new StringBuilder();
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
        BigInteger first1=new BigInteger(first.reverse().toString());
        BigInteger second2=new BigInteger(second.reverse().toString());
        BigInteger third=first1.add(second2);
        String  str=third.toString();
        String value=new StringBuilder(str).reverse().toString();
        ListNode head1=null;
        ListNode tail=null;
        for(int i=0;i<value.length();i++)
        {
            int ch=value.charAt(i)-'0';
            ListNode newnode=new ListNode(ch);
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