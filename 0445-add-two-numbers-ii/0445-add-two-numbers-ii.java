public class Solution {
    public ListNode reverse(ListNode l)
    {
        if(l==null || l.next==null)return l;
        ListNode last=reverse(l.next);
        l.next.next=l;
        l.next=null;
        return last;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1= reverse(l1);
        l2=reverse(l2);
        int sum=0;
        ListNode ans = new ListNode();
        int carry=0;
        while(l1 != null || l2!=null) {
            if(l1!=null) {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null) {
                sum+=l2.val;
                l2=l2.next;
            }
            ans.val=sum%10;
            carry=sum/10;
            ListNode curr=new ListNode(carry);
            curr.next=ans;
            ans=curr;
            sum=carry;
        }
        return carry==0?ans.next:ans;
        }
}