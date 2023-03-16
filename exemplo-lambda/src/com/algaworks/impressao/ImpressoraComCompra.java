package com.algaworks.impressao.impressoras;

import com.algaworks.compra.Compra;

@FunctionalInterface
public interface ImpressoraComCompra {

    void imprimir(Compra c);
    
}
