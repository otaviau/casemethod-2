public class TransaksiDLL {
    Node head, tail;

    public TransaksiDLL(){  
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void add(TransaksiPengisian data){
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
}