package org.example.classes;

import org.example.interfaces.IBalanca;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BalancaFizola implements IBalanca<Produto> {
    @Override
    public void exportar(List<Produto> produtos, String pastaArquivoTxt) {
        try (FileWriter writer = new FileWriter(pastaArquivoTxt + "/CADTXT.TXT")) {
            for (Produto produto : produtos) {
                writer.write(String.format("%06d", produto.getCodigo()));
                writer.write(produto.getTipo() == 1 ? "P" : "U");
                writer.write(String.format("%-22s", produto.getDescricao()));
                writer.write(String.format("%07d", (int) (produto.getValor() * 100)));
                writer.write("000\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
