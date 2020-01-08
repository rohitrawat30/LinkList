public class LinkList {

    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private int size=0;
    private Node head, tail;
    LinkList(){
        head=tail=null;
    }

    public void insert(int data){
        Node newnode = new Node(data);
       if(head==null){
           head=tail=newnode;
           size++;
       }else {
           Node curr=head;
           while(curr.next!=null){
               curr=curr.next;
           }
           curr.next=newnode;
           tail=newnode;
           size++;
       }
    }

    public void insert(int data, int loc){
        Node node = new Node(data);
        if(head==null){
            head=tail=node;
            size++;
        }else{
            Node curr= head;
            int i=0;
            while(curr!=null){
                if(i==loc-1){
                    
                }
                curr=curr.next;
                i++;
            }
        }
    }


    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
