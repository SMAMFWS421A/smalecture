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
        int result = 0;
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()){
            result++;
            iterator.next();
        }
        return result;
    }

    public boolean isEmpty() {

        return !this.iterator().hasNext();
    }

    public boolean contains(Object o) {
        ImmutableItem <T> current = first;
        while(current != null && !current.value.equals(o)){
            current = current.next;
        }
        return current != null && current.in;
    }

    public Iterator<T> iterator() {
        return new ImmutableSetIterator<T>(first);
    }

    public Set<T> toSet(){
        Set<T> result = new LinkedHashSet<T>();
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()){
            result.add(iterator.next());
        }
        return result;
    }
    public Object[] toArray() {
        return this.toSet().toArray();
    }

    public <E> E[] toArray(E[] a) {
        return this.toSet().toArray(a);
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
        ImmutableSet<T> result = this;
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()){
            T element = iterator.next();
            if (!c.contains(element)) {
                result = result.remove(element);
            }
        }
        return result;
    }

    public ImmutableSet<T> removeAll(Collection<? extends T> c) {

        ImmutableSet<T> result = this;

        for(T o: c) {
            result = result.remove(o);
        }
        return result;
    }

}
