class Solution {
    public ListNode mergeTwoLists(ListNode List1, ListNode List2) {
    ListNode dummy =new ListNode(-1);
    ListNode current =dummy ;
    while(List1!=null&&List2!=null){
        if(List1.val<=List2.val){
            current.next=List1;
            List1=List1.next;
        }
        else{
            current.next=List2;
            List2=List2.next;
        }
        current=current.next;
    }
    if(List1!=null){
        current.next=List1;
    }
    else{
        current.next=List2;
    }
    return dummy.next;

    }
}
