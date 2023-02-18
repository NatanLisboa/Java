package com.algaworks.util;

import java.util.List;

public class RetiraElementos {

    public static <T> T recuperaPrimeiroElemento(List<T> lista) { // <T> depois de public static: Declara o T apenas no método (tornando-o genérico), fazendo com que esse T possa ser utilizado logo depois como retorno do método (public static <T> T ...)
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }
}
