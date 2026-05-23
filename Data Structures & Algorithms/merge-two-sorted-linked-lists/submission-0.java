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
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=list1;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        temp=list2;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        ListNode dummy=new ListNode(-1);
        temp=dummy;
        int i=0;
        int n=arr.size();
        while(i<n){
            ListNode newnode=new ListNode(arr.get(i));
            i++;
            temp.next=newnode;;
            temp=temp.next;
        }
        return dummy.next;
    }
}