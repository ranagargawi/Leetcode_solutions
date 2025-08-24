public class RemoveDups38 {
    
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pos= head;
        while (pos!=null && pos.next!=null){
            ListNode tmp=pos.next;  
            // if(tmp.next==null) return;
            while(pos.val == tmp.val) {
                if(tmp.next==null) {
                    pos.next=null;
                    return head;
                }
                    tmp= tmp.next;
            }
            pos.next=tmp;
            pos=pos.next;
 
        }
       
return head;
    
}}
}
