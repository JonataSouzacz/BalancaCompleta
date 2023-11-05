package org.example.classes;

import org.example.interfaces.IBalanca;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BalancaUranoIntegra implements IBalanca<Produto>{

    @Override
    public void exportar(List<Produto> produtos, String pastaArquivoTxt) {
        try (FileWriter writer = new FileWriter(pastaArquivoTxt + "/URANO.TXT")) {
            for (Produto produto : produtos) {
                StringBuilder sb = new StringBuilder();

                sb.append(String.format("%06d", produto.getCodigo()));
                sb.append("*");
                sb.append(produto.getTipo() == 1 ? "6" : "0");  // Assumindo 1 como unidade e 0 como peso
                sb.append(String.format("%-20s", produto.getDescricao()));
                sb.append(String.format("%09.2f", produto.getValor()).replace(".", ",")); // Formatação com vírgula
                sb.append("00000D"); // Validade padrão

                writer.write(sb.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
