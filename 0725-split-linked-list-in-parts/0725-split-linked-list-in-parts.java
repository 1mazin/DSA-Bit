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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            n++;
        }
        int width=n/k,rem=n%k;
        ListNode[] ans=new ListNode[k];
        curr=head;
        for(int i=0;i<k;i++) {
            ListNode root=new ListNode(0);
            ListNode curr2=root;
            for(int j=0;j<width+(i<rem?1:0);j++){
                curr2=curr2.next=new ListNode(curr.val);
           
                if(curr!=null)curr=curr.next;
            }
            ans[i]=root.next;
        }
        return ans;
    }
}