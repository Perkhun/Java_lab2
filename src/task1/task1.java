package task1;

public class task1 {
    public static void main(final String[] args) {
        final DeLinkedList dequeue = new DeLinkedList();

        dequeue.equeueFirst(1);
        dequeue.equeueLast(-1);
        dequeue.put(3);
        dequeue.put(5);
        dequeue.put(-3);

        System.out.println(dequeue.getFirst());
        System.out.println(dequeue.getLast());
        System.out.println();

        for (final int value : dequeue) {
            System.out.println(value);
        }

    }
}
