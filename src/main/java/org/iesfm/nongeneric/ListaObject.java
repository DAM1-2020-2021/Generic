package org.iesfm.nongeneric;

public class ListaObject {
    private Object[] values;

    public ListaObject(Object[] values) {
        this.values = values;
    }

    public Object get(int position) {
        return values[position];
    }
}
