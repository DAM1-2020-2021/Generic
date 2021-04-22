package org.iesfm.generic;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] valuesStr = {"hola", "adios"};
        Lista<String> lista = new Lista<>(valuesStr);

        String hola = lista.get(0); // devuelve hola

        Integer[] valuesInteger = {2,3};
        Lista<Integer> listaInteger = new Lista<>(valuesInteger);

        Integer v = listaInteger.get(1); // devuelve 3

    }
}
