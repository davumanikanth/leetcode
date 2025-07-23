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
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null ||k ==0) return head;
          ListNode current=head;
        List<Integer> list=new ArrayList<>();
        int count=0;
        ListNode current1=head;
         while(current!=null)
        {
           count++;
            current=current.next;
        }
        if(count==0) return head;
        int[] value=new int[count];
        int index=0;
        while(current1!=null)
        {
            value[index++]=current1.val;
            current1=current1.next;
        }
        k=k%count;
        if(k==0) return head;
       for(int i=0;i<k;i++)
       {
        value=rotate(value);
       }
     ListNode head1=null;
            ListNode tail=null;
        for(int i=0;i<value.length;i++)
        {
            
            ListNode newnode=new ListNode(value[i]);
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
    public int[] rotate(int[] val)
    {
        int last=val[val.length-1];
        for(int i=val.length-1;i>0;i--)
        {
            val[i]=val[i-1];
        }
        val[0]=last;
        return val;
    }
}