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
        if(list1==null&&list2==null) return null;
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode trav=dummy;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<=temp2.val){
                ListNode newnode=new ListNode(temp1.val);
                trav.next=newnode;
                temp1=temp1.next;
            }
            else{
                ListNode newnode=new ListNode(temp2.val);
                trav.next=newnode;
                temp2=temp2.next;
            }
            trav=trav.next;
        }
        while(temp1!=null){
            ListNode newnode=new ListNode(temp1.val);
            trav.next=newnode;
            temp1=temp1.next;
            trav=trav.next;
        }
        while(temp2!=null){
            ListNode newnode=new ListNode(temp2.val);
            trav.next=newnode;
            temp2=temp2.next;
            trav=trav.next;
        }
        return dummy.next;
    }
}