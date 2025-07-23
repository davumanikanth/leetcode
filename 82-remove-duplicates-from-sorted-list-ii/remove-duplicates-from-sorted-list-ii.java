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
        if(head==null) return head;
        ListNode current=head;
        HashMap<Integer,Integer> group=new LinkedHashMap<>();
        while(current!=null)
        {
            group.put(current.val,group.getOrDefault(current.val,0)+1);
            current=current.next;
        }
        StringBuilder res=new StringBuilder();
        ListNode head1=null;
        ListNode tail=null;
        for(Map.Entry<Integer,Integer> entry:group.entrySet())
        {
            if(entry.getValue()==1)
            {
            
            ListNode newnode=new ListNode(entry.getKey());
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

        }
        return head1;
        
        
    }
}