package com.generic.classes;

public class SampleOne<T> {
    T ref;

    public SampleOne() {
    }

    public SampleOne(T ref) {
        this.ref = ref;
    }

    public T getRef() {
        return ref;
    }

    public void setRef(T ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "SampleOne{" +
                "ref=" + ref +
                '}';
    }
}
