public class Node {
    public TransaksiPengisian data;
    public Node prev, next;

    public Node (TransaksiPengisian data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
