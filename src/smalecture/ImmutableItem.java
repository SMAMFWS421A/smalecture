package smalecture;

import java.util.*;


class ImmutableItem <T>{

final T value;
final boolean in;
final ImmutableItem <T> next;

ImmutableItem (T value, ImmutableItem <T> next, boolean in){
    this.value = value;
    this.next = next;
    this.in = in;
    }


} 