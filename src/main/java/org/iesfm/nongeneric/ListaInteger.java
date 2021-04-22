package org.iesfm.nongeneric;

public class ListaInteger {
    private Integer[] values;

    public ListaInteger(Integer[] values) {
        this.values = values;
    }

    public Integer get(int position) {
        return values[position];
    }
}
