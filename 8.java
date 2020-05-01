/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode a = head;
        int size = 0;
        while(a != null) {
            a = a.next;
            size++;
        }
        a = head;
        for (int i = 0; i < size / 2; i++) {
            a = a.next;
        }
        return a;
    }
}