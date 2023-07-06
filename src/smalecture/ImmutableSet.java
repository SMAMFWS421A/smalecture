package smalecture;

import java.util.*;



public class ImmutableSet<T> {

    final ImmutableItem <T> first;

    ImmutableSet (ImmutableItem <T> first)
    {
        this.first = first;
    }

    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean contains(Object o) {
        ImmutableItem <T> current = first;
        while(current != null && !current.value.equals(o)){
            current = current.next;
        }
        return current != null && current.in;
    }

    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public <E> E[] toArray(E[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    public ImmutableSet<T> add(T e) {
        return new ImmutableSet (new ImmutableItem(e,first,true));
    }

    public ImmutableSet<T> remove(T e) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public ImmutableSet<T> addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return null;
    }

    public ImmutableSet<T> retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return null;
    }

    public ImmutableSet<T> removeAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return null;
    }

}
