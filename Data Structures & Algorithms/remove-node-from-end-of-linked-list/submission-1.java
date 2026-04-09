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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
    ListNode curr=head;
    int  size=0;
    while(curr!=null){
      size++;
      curr=curr.next;
    }
    int index=size-n;
    if(index==0){
        return head.next;
    }
    curr=head;
    int i=0;
    while(curr!=null){
        if((i+1)== index){
            curr.next=curr.next.next;
        }
         i++;
        curr=curr.next;
    }
    return head;

    }
}
