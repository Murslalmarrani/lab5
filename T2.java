public int size() {
    int count = 0;
    if (tail != null) {
        Node<E> current = tail.next;
        while (current != tail) {
            count++;
            current = current.next;
        }
        count++;
    }
    return count;
}
