package org.iesfm.nongeneric;

public class ListaString {
    private String[] values;

    public ListaString(String[] values) {
        this.values = values;
    }

    public String get(int position) {
        return values[position];
    }
}
