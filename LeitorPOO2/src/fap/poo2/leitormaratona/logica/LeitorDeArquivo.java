package fap.poo2.leitormaratona.logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorDeArquivo {
	public List<String> ler(String nome) {
		List<String> linhas = new ArrayList<String>();
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader arquivoNoBuffer = new BufferedReader(arq);

			String linha = arquivoNoBuffer.readLine();

			while (linha != null) {
				linhas.add(linha);
				linha = arquivoNoBuffer.readLine();
			}

			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		
		linhas.remove(0);
		
		return linhas;
	}
}
