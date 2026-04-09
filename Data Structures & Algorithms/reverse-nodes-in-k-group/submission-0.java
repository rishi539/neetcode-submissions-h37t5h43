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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kth=kthnode(temp,k);
            if(kth==null){
                if(prev!=null)prev.next=temp;
                break;
            }
            ListNode nextnode=kth.next;
            kth.next=null;
            reverse(temp);
            if(temp==head){
                head=kth;
            }else{
              prev.next=kth;
            }
            prev=temp;
            temp=nextnode;

        }
        return head;

        
    }
    public ListNode kthnode(ListNode temp,int k){
       
        while(temp!=null && k>0){
            k--;
            if(k>0)temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode temp){
        ListNode cur=temp;
        ListNode prev=null;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
