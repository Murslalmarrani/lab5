
public CircularlyLinkedList<E> clone() throws CloneNotSupportedException {
    CircularlyLinkedList<E> other = new CircularlyLinkedList<>();
    if (size > 0) {
        other.head = new Node<>(head.getElement(), null);
        other.tail = other.head;
        Node<E> walk = head.getNext();
        while (walk != null) {
            Node<E> newest = new Node<>(walk.getElement(), null);
            other.tail.setNext(newest);
            other.tail = newest;
            walk = walk.getNext();
        }
    }
    return other;
}
