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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        // finding the 1st val
        while(--k>0){
            fast = fast.next;
        }
        int store = fast.val;
        ListNode temp = fast;
        // finding the 2nd val
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //swap
        int store2 = slow.val;
        slow.val = store;
        temp.val = store2;

        
        return head;
    }
}
