package org.iesfm.nongeneric;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] values = {"hola", "adios"};
        ListaString lista = new ListaString(values);

        String hola = lista.get(0); // devuelve hola
        String adios = lista.get(1); // devuelve adios

        Integer[] valuesInt = {3, 4};
        ListaInteger listaInt = new ListaInteger(valuesInt);

        Object[] valuesObjectStr = {"hola", 2, true, new ListaString(null)};
        ListaObject listaObjectStr = new ListaObject(valuesObjectStr);
        String hola2 = (String) listaObjectStr.get(3); // devuelve hola


        Object[] valuesObjectInt = {3, 4};
        ListaObject listaObjectInt = new ListaObject(valuesObjectInt);
    }
}
