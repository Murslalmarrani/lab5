
public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (!(obj instanceof CircularlyLinkedList)) {
        return false;
    }
    CircularlyLinkedList other = (CircularlyLinkedList) obj;
    if (size != other.size()) {
        return false;
    }
    Node<E> current = tail.next;
    Node<E> otherCurrent = other.tail.next;
    while (current != tail) {
        if (!current.data.equals(otherCurrent.data)) {
            return false;
        }
        current = current.next;
        otherCurrent = otherCurrent.next;
    }
    return tail.data.equals(other.tail.data);
}

