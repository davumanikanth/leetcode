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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode current=head;
          ListNode current1=head;
        int count=0;

        while(current!=null)
        {
            count++;
            current=current.next;

        }
        int[] arr=new int[count];
        int index=0;
        while(current1!=null)
        {
            arr[index++]=current1.val;
            current1=current1.next;

        }
        int lef=left-1;
        int righ=right-1;
        while(lef<righ)
        {
            int temp=arr[lef];
            arr[lef]=arr[righ];
            arr[righ]=temp;
            lef++;
            righ--;
        }
        ListNode head1=null;
        ListNode tail=null;
        for(int i=0;i<index;i++)
        {
            ListNode newnode=new ListNode(arr[i]);
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