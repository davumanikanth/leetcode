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
    public ListNode doubleIt(ListNode head) {
        if(head==null) return head;
        StringBuilder result=new StringBuilder();
        ListNode current=head;
        while(current!=null)
        {
            result.append(current.val);
            current=current.next;
        }
        String result1=result.toString();
        BigInteger first=new BigInteger(result1);
        BigInteger second=new BigInteger("2");
        BigInteger third=first.multiply(second);
        String value=third.toString();

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