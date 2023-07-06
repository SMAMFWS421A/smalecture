package smalecture;

import java.util.*;

class ImmutableSetIterator<T> implements Iterator<T> {

    ImmutableItem<T> current;

    ImmutableSet<T> seen;


    ImmutableSetIterator(ImmutableItem<T> first) {
        this.current = first;
        this.seen = new ImmutableSet<T>();
    }

    public boolean hasNext() {
        while(current != null && (!current.in || seen.contains(current.value))) {
            seen = seen.add(current.value);
            current = current.next;
        }

        return current != null;
    }

    public T next() {
        if (hasNext()) {
            T result = current.value;
            current = current.next;
            return result;
        }

        throw new NoSuchElementException();
    }
}