package org.example;

import org.example.classes.BalancaFizola;
import org.example.classes.BalancaToledo;
import org.example.classes.BalancaUranoIntegra;
import org.example.classes.Produto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(270, "QUEIJO GRUYERE KG", 1, 2.19);
        Produto produto2 = new Produto(288, "QUEIJO PROVOLETE KG", 1, 1.229);

        List<Produto> produtos = List.of(produto1, produto2);

        var balancaFilizola = new BalancaFizola();
        balancaFilizola.exportar(produtos, ".");

        var balancaToledo = new BalancaToledo();
        balancaToledo.exportar(produtos, ".");

        var balancaUrano = new BalancaUranoIntegra();
        balancaUrano.exportar(produtos, ".");
    }
}

