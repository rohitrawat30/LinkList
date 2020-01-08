public class DLinkList {

    private class Node{
        int data;
        Node next;
        Node prev;

        Node(Node p, int d, Node n){
            this.data=d;
            this.next=n;
            this.prev=p;
        }
    }

    Node first, last;
    int size;

    private void addFirst(int data){
        Node f = first;
        Node node = new Node(null, data, first);
        first=node;
        if(f==null){
            last=node;
        }else{
            f.prev=node;
        }
        size++;
    }
    private void addlast(int data){
        Node l = last;
        Node node = new Node(last, data, null);
        last=node;
        if(l==null){
            first=node;
        }else{
            l.next=node;
        }
        size++;
    }

    private Node getNode(int index){ //1
        Node temp = first;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        return temp;
    }

    public void add(int data){
        addlast(data);
    }
    public void add(int data, int index){
        if(index>=size){
            addlast(data);
        }else if(size==0){
            addFirst(data);
        }
        else{
        Node node = new Node(null,data,null);
        addBefore(node,getNode(index));}
    }

    private void addBefore(Node e, Node succ){
       Node prev = succ.prev;
       e.next=succ;
       e.prev=prev;
       succ.prev=e;
       if(prev==null){
          first=e;
       }
       else {
           prev.next=e;
       }

       size++;
    }

    public void print(){
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


}

