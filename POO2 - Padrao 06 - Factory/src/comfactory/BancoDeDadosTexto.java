package comfactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosTexto implements BancoDeDados {
	private List<String> desenhos = new ArrayList<String>();

	public BancoDeDadosTexto() {
		desenhos = arquivoParaArrayDeStrings();
	}

	private List<String> arquivoParaArrayDeStrings() {
		List<String> linhas = new ArrayList<String>();

		try {
			FileReader fileReader = new FileReader("bd_texto");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha = bufferedReader.readLine();
			do {
				linhas.add(linha);
				linha = bufferedReader.readLine();
			} while (linha != null);

			fileReader.close();
		} catch (IOException e) {
			System.err.println("Erro na abertura do arquivo: " + e.getMessage());
		}
		return linhas;

	}
	@Override
	public void exibirDesenhos() {
		System.out.println("\nDesenhos - bdTexto");
		desenhos.forEach(System.out::println);		
	}

}
