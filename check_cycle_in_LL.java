/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// also known as  floyd's ycle detect algorithm  
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
       ListNode slow = head;
       ListNode fast = head;

       while(fast != null && fast.next != null){
           slow = slow.next; // +1
           fast = fast.next.next; // +2

           if(slow == fast){
               return true;
           }
       }
       return false;
        
    }
    };