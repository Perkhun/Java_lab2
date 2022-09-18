package task1;

public class Node {
    private int info;
    private Node next;
    private Node prev;

    public Node(final int info, final Node next, final Node prev ) {
        this.info = info;
        this.next = next;
        this.prev = prev;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(final int info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(final Node prev) {
        this.prev = prev;
    }
}
