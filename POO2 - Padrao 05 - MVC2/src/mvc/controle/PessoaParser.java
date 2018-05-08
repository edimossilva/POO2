package mvc.controle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import mvc.modelo.Pessoa;

public class PessoaParser {

	public Pessoa hashmapToPessoa(HashMap<String, String> pessoaDTO) {
		String nome = pessoaDTO.get("nome");
		String dataDeNascimentoString = pessoaDTO.get("dataDeNascimentome");
		LocalDate dataDeNascimento = converteStringParaData(dataDeNascimentoString);

		return new Pessoa(nome, dataDeNascimento);

	}

	private LocalDate converteStringParaData(String dataDeNascimentoString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(dataDeNascimentoString, formatter);
	}
}
