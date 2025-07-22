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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode curr1=list1;
       List<Integer> result=new ArrayList<>();

       while(curr1!=null) 
       {
         result.add(curr1.val);
         curr1=curr1.next;
       }
       ListNode curr2=list2;
       while(curr2!=null)
       {
        result.add(curr2.val);
        curr2=curr2.next;
       }
       Collections.sort(result);
       ListNode head=null;
       ListNode tail=null;
       for(int i=0;i<result.size();i++)
       {
           ListNode newnode=new ListNode(result.get(i));
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