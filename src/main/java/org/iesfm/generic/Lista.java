package org.iesfm.generic;

public class Lista<T> {

    private T[] values;

    public Lista(T[] values) {
        this.values = values;
    }

    public T get(int index) {
        return values[index];
    }
}
