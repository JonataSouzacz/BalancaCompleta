package org.example.interfaces;

import org.example.classes.Produto;

import java.util.List;

public interface IBalanca<t> {

    void exportar(List<Produto> produtos, String pastaArquivoTxt);
}

