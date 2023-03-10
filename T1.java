public void addFirst(E element) {
    if (size == 0) {
        tail = new Node<>(element, null);
        tail.next = tail;
    } else {
        tail.next = new Node<>(element, tail.next);
    }
    size++;
}
