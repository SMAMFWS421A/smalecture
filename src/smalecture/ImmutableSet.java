package smalecture;

import java.util.*;



public class ImmutableSet<T> {

    final ImmutableItem <T> first;

    ImmutableSet (ImmutableItem <T> first)
    {
        this.first = first;
    }

    ImmutableSet() {
        this(null);
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
        return new ImmutableSet<T>(new ImmutableItem<T>(e,first,true));
    }

    public ImmutableSet<T> remove(T e) {
        return new ImmutableSet<T>(new ImmutableItem<T>(e,first,false));
    }

    public boolean containsAll(Collection<?> c) {

        for(Object o: c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    public ImmutableSet<T> addAll(Collection<? extends T> c) {

        ImmutableSet<T> result = this;

        for(T o: c) {
            result = result.add(o);
        }
        return result;
    }

    public ImmutableSet<T> retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return null;
    }

    public ImmutableSet<T> removeAll(Collection<? extends T> c) {

        ImmutableSet<T> result = this;

        for(T o: c) {
            result = result.remove(o);
        }
        return result;
    }

}
