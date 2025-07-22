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
    public boolean isPalindrome(ListNode head) {
        ListNode current=head;
        List<Integer> result=new ArrayList<>();
        while(current!=null)
        {
            result.add(current.val);
            current=current.next;
        }
       
        
        int left=0;
        int right=result.size()-1;
        while(left<right)
        {
            if(!result.get(left).equals(result.get(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}