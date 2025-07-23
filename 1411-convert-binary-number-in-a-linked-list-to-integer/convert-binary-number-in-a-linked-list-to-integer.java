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
    public int getDecimalValue(ListNode head) {
        StringBuilder fi=new StringBuilder();
        ListNode current=head;
        while(current!=null)
        {
            fi.append(current.val);
            current=current.next;
        }
        String result=fi.toString();
        int result1=Integer.parseInt(result,2);
        return result1;
        
    }
}