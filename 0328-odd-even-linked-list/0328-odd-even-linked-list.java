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
    public ListNode oddEvenList(ListNode head) {
        if( head == null || head.next == null) 
            return head;
        

        ListNode Odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; 

        while(even != null && even.next != null) {
            Odd.next = even.next;
            Odd = Odd.next;

            even.next = Odd.next;
            even = even.next;
        }

        Odd.next = evenHead;

        return head;

        }
    }