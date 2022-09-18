package task1;

import java.util.Iterator;

public class DeLinkedList implements Dequeue, Iterable<Integer>{
    protected Node first;
    protected Node last;

    @Override
    public void equeueFirst(final int value) {
        final Node firstNode = this.first;
        final Node newNode = new Node(value, first, null );
        first = newNode;
        if (firstNode == null) {
            last = newNode;
        } else {
            firstNode.setPrev(newNode);
        }
    }

    @Override
    public void equeueLast(final int value) {
        final Node lastNode = this.last; // 1 3 5
        final Node newNode = new Node(value,null, last);
        last = newNode;
        if (lastNode == null) {
            first = newNode;
        } else {
            lastNode.setNext(newNode);
        }

    }

    public void put(final int value) {
        equeueFirst(value);
    }
    @Override
    public int getFirst() {
        return first.getInfo();
    }

    @Override
    public int getLast() {
        return last.getInfo();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new DeLinkedListIterator();
    }

    private class DeLinkedListIterator implements Iterator<Integer> {
        Node next = first;

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Integer next() {
            final Node value = next;
            next = next.getNext();
            return value.getInfo();
        }
    }
}

